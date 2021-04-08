package com.home.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Copyright©2015 www.123cx.com All Rights Reserved. 版权所有 湖南智慧畅行交通科技有限公司
 * Project:
 * Comments:
 * Author： 
 * Create Date：2017年5月6日
 * Version: 
*/
@ServletComponentScan
@SpringBootApplication
public class HomesApplication {	
	public static void main(String[] args) {
		SpringApplication.run(HomesApplication.class, args);
	}
}