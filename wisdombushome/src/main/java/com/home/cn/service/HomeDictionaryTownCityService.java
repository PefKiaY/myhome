package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeDictionaryTownCityParam;
import com.home.cn.resp.HomeDictionaryTownCityResp;

public interface HomeDictionaryTownCityService {
	
	 List<HomeDictionaryTownCityResp> query(HomeDictionaryTownCityParam param);

	 int insert(HomeDictionaryTownCityParam param);
	 
	 HomeDictionaryTownCityResp updae(HomeDictionaryTownCityParam param);
	 
	 int delete(HomeDictionaryTownCityParam param);
	 
}
