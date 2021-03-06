package com.home.cn.mybatis;

import org.apache.commons.lang3.StringUtils;    
import org.mybatis.spring.SqlSessionFactoryBean;    
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;    
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;    
import org.springframework.core.io.support.ResourcePatternResolver;    
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;    
import org.springframework.core.type.classreading.MetadataReader;    
import org.springframework.core.type.classreading.MetadataReaderFactory;    
import org.springframework.util.ClassUtils;    
    
import java.io.IOException;    
import java.util.ArrayList;    
import java.util.List;    
    
/**
 * Copyright©2015 www.123cx.com All Rights Reserved. 版权所有 湖南智慧畅行交通科技有限公司
 * Project: wisdombus-business
 * Comments: 自定义SqlSessionFactoryBean，使支持通配符扫描domain
 * Author： pq
 * Create Date：2017年5月6日
 * Version: 
*/
public class MySqlSessionFactoryBean extends SqlSessionFactoryBean {    
    
    static final String DEFAULT_RESOURCE_PATTERN = "**/*.class";    
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Override    
    public void setTypeAliasesPackage(String typeAliasesPackage) {    
        ResourcePatternResolver resolver = (ResourcePatternResolver) new PathMatchingResourcePatternResolver();    
        MetadataReaderFactory metadataReaderFactory = new CachingMetadataReaderFactory(resolver);    
        typeAliasesPackage = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX +    
                ClassUtils.convertClassNameToResourcePath(typeAliasesPackage) + "/" + DEFAULT_RESOURCE_PATTERN;    
    
        //将加载多个绝对匹配的所有Resource    
        //将首先通过ClassLoader.getResource("META-INF")加载非模式路径部分    
        //然后进行遍历模式匹配    
        try {    
            List<String> result = new ArrayList<String>();    
            Resource[] resources =  resolver.getResources(typeAliasesPackage);    
            if(resources != null && resources.length > 0){    
                MetadataReader metadataReader = null;    
                for(Resource resource : resources){    
                    if(resource.isReadable()){    
                       metadataReader =  metadataReaderFactory.getMetadataReader(resource);    
                        try {    
                            result.add(Class.forName(metadataReader.getClassMetadata().getClassName()).getPackage().getName());    
                        } catch (ClassNotFoundException e) {    
                            e.printStackTrace();    
                        }    
                    }    
                }    
            }    
            if(result.size() > 0) {    
                super.setTypeAliasesPackage(StringUtils.join(result.toArray(), ","));    
            }else{    
                logger.warn("参数typeAliasesPackage:"+typeAliasesPackage+"，未找到任何包");    
            }    
        } catch (IOException e) {    
        	logger.error("扫描domain出错", e);
        }    
    }    
    
}    