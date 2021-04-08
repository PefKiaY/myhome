package com.home.cn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright©2015 www.123cx.com All Rights Reserved. 版权所有 湖南智慧畅行交通科技有限公司
 * Project: wisdombus-business
 * Comments:  Swagger2配置类
 * Author： pq
 * Create Date：2017年5月6日
 * Version: 
*/
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com"))
                .paths(PathSelectors.any())
                .build();
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("智慧公交业务系统API")
                .description("")
                .termsOfServiceUrl("http://wiki.123cx.com")
                .contact("智慧畅行")
                .version("1.0")
                .build();
    }

}