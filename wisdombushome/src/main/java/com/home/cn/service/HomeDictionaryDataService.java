package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeDictionaryDataParam;
import com.home.cn.resp.HomeDictionaryDataResp;

public interface HomeDictionaryDataService {
	
	 List<HomeDictionaryDataResp> query(HomeDictionaryDataParam param);

	 int insert(HomeDictionaryDataParam param);
	 
	 HomeDictionaryDataResp updae(HomeDictionaryDataParam param);
	 
	 int delete(HomeDictionaryDataParam param);
	 
}
