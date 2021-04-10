package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeFormDetailParam;
import com.home.cn.resp.HomeFormDetailResp;

public interface HomeFormDetailService {
	
	 List<HomeFormDetailResp> query(HomeFormDetailParam param);

	 int insert(HomeFormDetailParam param);
	 
	 HomeFormDetailResp updae(HomeFormDetailParam param);
	 
	 int delete(HomeFormDetailParam param);
	 
	 List<HomeFormDetailResp> query(HomeFormDetailParam param, int skipResults, int maxResults);
	 
	 int count(HomeFormDetailParam param);
	 
}
