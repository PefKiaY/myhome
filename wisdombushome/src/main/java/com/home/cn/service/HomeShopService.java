package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeShopParam;
import com.home.cn.resp.HomeShopResp;

public interface HomeShopService {
	
	 List<HomeShopResp>query(HomeShopParam param);

	 int insert(HomeShopParam param);
	 
	 HomeShopResp updae(HomeShopParam param);
	 
	 int delete(HomeShopParam param);
}
