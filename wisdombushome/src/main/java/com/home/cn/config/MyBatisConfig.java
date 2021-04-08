package com.home.cn.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.home.cn.mybatis.MySqlSessionFactoryBean;
import com.zhcx.platform.pagination.PaginationInterceptor;

/**
 * Copyright©2015 www.123cx.com All Rights Reserved. 版权所有 湖南智慧畅行交通科技有限公司
 * Project: wisdombus-business
 * Comments:  MyBatis配置类
 * Author： pq
 * Create Date：2017年5月6日
 * Version: 
*/
@Configuration
@EnableTransactionManagement
@ComponentScan
@MapperScan(basePackages = "com.**.**.**.mapper")
public class MyBatisConfig {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Value("${spring.datasource.type}")
	private Class<? extends DataSource> dataSourceType;

	@Value("${mybatis.mapperLocations}")
	private String mapperLocations;

	@Value("${mybatis.typeAliasesPackage}")
	private String typeAliasesPackage;

	// @Autowired
	// private MyBatisMapperScannerConfig myBatisConfig;

	@Bean(name = "dataSource", destroyMethod = "close", initMethod = "init")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		log.info("-------------------- writeDataSource init ---------------------");
		return DataSourceBuilder.create().type(dataSourceType).build();
	}

	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new MySqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		sqlSessionFactoryBean.setConfigurationProperties(getProperties());
		sqlSessionFactoryBean.setPlugins(getPlugins());
		sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasesPackage);
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mapperLocations));
		sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
		return sqlSessionFactoryBean.getObject();
	}
	
	private Properties getProperties() {
		Properties properties = new Properties();
		properties.setProperty("dialect", "mysql");
		return properties;
	}

	private Interceptor[] getPlugins() {
		PaginationInterceptor pi = new PaginationInterceptor();
		Interceptor[] plugins = new Interceptor[] { pi };
		return plugins;
	}

	/**
	 * 配置事务管理器
	 */
	@Bean(name = "transactionManager")
	@Primary
	public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource)
			throws Exception {
		return new DataSourceTransactionManager(dataSource);
	}
}
