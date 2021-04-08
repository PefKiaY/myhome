package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeAuthUserParam;
import com.home.cn.resp.HomeAuthUserResp;

public interface HomeAuthUserService {
	
	 List<HomeAuthUserResp>query(HomeAuthUserParam param);

	 int insert(HomeAuthUserParam param);
	 
	 HomeAuthUserResp updae(HomeAuthUserParam param);
	 
	 int delete(HomeAuthUserParam param);
}
