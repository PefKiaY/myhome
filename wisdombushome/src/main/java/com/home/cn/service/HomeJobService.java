package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeJobParam;
import com.home.cn.resp.HomeJobResp;

public interface HomeJobService {
	
	 List<HomeJobResp> query(HomeJobParam param);

	 int insert(HomeJobParam param);
	 
	 HomeJobResp updae(HomeJobParam param);
	 
	 int delete(HomeJobParam param);
	 
	 List<HomeJobResp> query(HomeJobParam param, int skipResults, int maxResults);
	 
	 int count(HomeJobParam param);
}
