package com.home.cn.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Copyright©2015 www.123cx.com All Rights Reserved. 版权所有 湖南智慧畅行交通科技有限公司
 * Project: wisdombus-business
 * Comments: 备用
 * Author： pq
 * Create Date：2017年5月6日
 * Version: 
*/
@ConfigurationProperties(prefix = "mybatis")
@EnableConfigurationProperties
public class MyBatisMapperScannerConfig {
	
//	@Value("${mybatis.basePackage}")
	private String basePackage;
	
//	@Value("${mybatis.mapperLocations}")
	private String mapperLocations;

	public String getBasePackage() {
		return basePackage;
	}

	public String getMapperLocations() {
		return mapperLocations;
	}

	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}

	public void setMapperLocations(String mapperLocations) {
		this.mapperLocations = mapperLocations;
	}

	@Override
	public String toString() {
		return "MyBatisMapperScannerConfig [basePackage=" + basePackage + ", mapperLocations=" + mapperLocations + "]";
	}
	
}
