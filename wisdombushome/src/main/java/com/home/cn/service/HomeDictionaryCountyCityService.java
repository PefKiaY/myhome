package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeDictionaryCountyCityParam;
import com.home.cn.resp.HomeDictionaryCountyCityResp;

public interface HomeDictionaryCountyCityService {
	
	 List<HomeDictionaryCountyCityResp> query(HomeDictionaryCountyCityParam param);

	 int insert(HomeDictionaryCountyCityParam param);
	 
	 HomeDictionaryCountyCityResp updae(HomeDictionaryCountyCityParam param);
	 
	 int delete(HomeDictionaryCountyCityParam param);
	 
}
