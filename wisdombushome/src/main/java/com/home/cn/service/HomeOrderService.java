package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeOrderParam;
import com.home.cn.resp.HomeOrderResp;

public interface HomeOrderService {
	
	 List<HomeOrderResp> query(HomeOrderParam param);

	 int insert(HomeOrderParam param);
	 
	 HomeOrderResp updae(HomeOrderParam param);
	 
	 int delete(HomeOrderParam param);
	 
	 
	 List<HomeOrderResp> query(HomeOrderParam param, int skipResults, int maxResults);
	 
	 int count(HomeOrderParam param);
	 
}
