package com.home.cn.druid;

import com.alibaba.druid.support.http.WebStatFilter;  


import javax.servlet.annotation.WebFilter;  
import javax.servlet.annotation.WebInitParam;  
  
/**
 * Copyright©2015 www.123cx.com All Rights Reserved. 版权所有 湖南智慧畅行交通科技有限公司
 * Project: wisdombus-business
 * Comments: Druid拦截器，用于查看Druid监控 
 * Author： pq
 * Create Date：2017年5月6日
 * Version: 
*/
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",  
        initParams={  
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源  
        })  
public class DruidStatFilter extends WebStatFilter {  
}  