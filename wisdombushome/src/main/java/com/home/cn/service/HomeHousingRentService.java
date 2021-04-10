package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeHousingRentParam;
import com.home.cn.resp.HomeHousingRentResp;

public interface HomeHousingRentService {
	
	 List<HomeHousingRentResp> query(HomeHousingRentParam param);

	 int insert(HomeHousingRentParam param);
	 
	 HomeHousingRentResp updae(HomeHousingRentParam param);
	 
	 int delete(HomeHousingRentParam param);
	 
	 List<HomeHousingRentResp> query(HomeHousingRentParam param, int skipResults, int maxResults);
	 
	 int count(HomeHousingRentParam param);
	 
}
