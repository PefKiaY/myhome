package com.home.cn.config;

import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Copyright©2015 www.123cx.com All Rights Reserved. 版权所有 湖南智慧畅行交通科技有限公司
 * Project: wisdombus-business
 * Comments:  Druid的DataResource配置类
 * Author： pq
 * Create Date：2017年5月6日
 * Version: 
*/
@Configuration  
@EnableTransactionManagement  
public class DruidDataSourceConfig {
	
	private RelaxedPropertyResolver propertyResolver;  
	  
    public void setEnvironment(Environment env) {  
        this.propertyResolver = new RelaxedPropertyResolver(env, "spring.datasource.");  
    }  
}
