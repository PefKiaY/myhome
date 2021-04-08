package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeDictionaryProvinceCityParam;
import com.home.cn.resp.HomeDictionaryProvinceCityResp;

public interface HomeDictionaryProvinceCityService {
	
	 List<HomeDictionaryProvinceCityResp> query(HomeDictionaryProvinceCityParam param);

	 int insert(HomeDictionaryProvinceCityParam param);
	 
	 HomeDictionaryProvinceCityResp updae(HomeDictionaryProvinceCityParam param);
	 
	 int delete(HomeDictionaryProvinceCityParam param);
	 
}
