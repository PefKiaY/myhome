package com.zhcx.platform.pagination;

import java.sql.Connection;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;

/**
 * Copyright dayhr2013-2014 All rights reserved
 * 
 * @ClassName: PaginationInterceptor
 * @Description: 分页底层操作
 * @author Chenpz<pengzhen_chen@dayhr.com>
 * @date 2014-4-24 下午4:44:49
 * 
 */
@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class, Integer.class }) })
public class PaginationInterceptor implements Interceptor {

	private final static Log log = LogFactory
			.getLog(PaginationInterceptor.class);
	
	/**
     * 默认ObjectFactory
     */
    private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
    /**
     * 默认ObjectWrapperFactory
     */
    private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
    /**
     * 默认ReflectorFactory
     */
    private static final ReflectorFactory DEFAULT_REFLECTOR_FACTORY = new DefaultReflectorFactory();

	public Object intercept(Invocation invocation) throws Throwable {

		StatementHandler statementHandler = (StatementHandler) invocation
				.getTarget();

		BoundSql boundSql = statementHandler.getBoundSql();

		MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY, DEFAULT_REFLECTOR_FACTORY);

		Object obj = metaStatementHandler.getValue("delegate.rowBounds");

		if (obj == null) {
			return invocation.proceed();
		} else {
			if (obj instanceof RowBounds) {
				RowBounds rowBounds = (RowBounds) obj;
				if (rowBounds == RowBounds.DEFAULT) {
					return invocation.proceed();
				} else {
					Configuration configuration = (Configuration) metaStatementHandler
							.getValue("delegate.configuration");
					Dialect.Type databaseType = null;
					try {
						databaseType = Dialect.Type.valueOf(configuration
								.getVariables().getProperty("dialect")
								.toUpperCase());
					} catch (Exception e) {
						// ignore
					}
					if (databaseType == null) {
						throw new RuntimeException(
								"the value of the dialect property in configuration.xml is not defined : "
										+ configuration.getVariables()
												.getProperty("dialect"));
					}
					Dialect dialect = null;
					switch (databaseType) {
					case MYSQL:
						dialect = new MySql5Dialect();
						break;
					case ORACLE:
						dialect = new OracleDialect();
						break;
					default:
						dialect = new MySql5Dialect();
					}

					String originalSql = (String) metaStatementHandler
							.getValue("delegate.boundSql.sql");
					metaStatementHandler
							.setValue("delegate.boundSql.sql", dialect
									.getLimitString(originalSql,
											rowBounds.getOffset(),
											rowBounds.getLimit()));
					metaStatementHandler.setValue("delegate.rowBounds.offset",
							RowBounds.NO_ROW_OFFSET);
					metaStatementHandler.setValue("delegate.rowBounds.limit",
							RowBounds.NO_ROW_LIMIT);
					if (log.isDebugEnabled()) {
						log.debug("生成分页SQL : " + boundSql.getSql());
					}
				}
			}
		}
		return invocation.proceed();
	}

	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	public void setProperties(Properties p) {
	}

}
