package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeHousingAttaParam;
import com.home.cn.resp.HomeHousingAttaResp;

public interface HomeHousingAttaService {
	
	 List<HomeHousingAttaResp> query(HomeHousingAttaParam param);

	 int insert(HomeHousingAttaParam param);
	 
	 HomeHousingAttaResp updae(HomeHousingAttaParam param);
	 
	 int delete(HomeHousingAttaParam param);
	 
}
