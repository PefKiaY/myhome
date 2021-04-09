package com.zhcx.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "zhcx.constant")
public class Constant {

	private int uuidRedisDb;
	
	private int myBatisRedisDb;

	private String uuidRedisKey = "seq:zhcx:uuid";

	private String myBatisCacheKeyPrefix = "mybatis";

	private String defaultCharset = "UTF-8";

	public String getDefaultCharset() {
		return defaultCharset;
	}

	public void setDefaultCharset(String defaultCharset) {
		this.defaultCharset = defaultCharset;
	}

	public String getMyBatisCacheKeyPrefix() {
		return myBatisCacheKeyPrefix;
	}

	public void setMyBatisCacheKeyPrefix(String myBatisCacheKeyPrefix) {
		this.myBatisCacheKeyPrefix = myBatisCacheKeyPrefix;
	}

	public int getUuidRedisDb() {
		return uuidRedisDb;
	}

	public void setUuidRedisDb(int uuidRedisDb) {
		this.uuidRedisDb = uuidRedisDb;
	}

	public String getUuidRedisKey() {
		return uuidRedisKey;
	}

	public void setUuidRedisKey(String uuidRedisKey) {
		this.uuidRedisKey = uuidRedisKey;
	}

	public int getMyBatisRedisDb() {
		return myBatisRedisDb;
	}

	public void setMyBatisRedisDb(int myBatisRedisDb) {
		this.myBatisRedisDb = myBatisRedisDb;
	}

}
