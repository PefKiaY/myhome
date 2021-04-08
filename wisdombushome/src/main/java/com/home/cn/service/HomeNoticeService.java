package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomeNoticeParam;
import com.home.cn.resp.HomeNoticeResp;

public interface HomeNoticeService {
	
	 List<HomeNoticeResp>query(HomeNoticeParam param);

	 int insert(HomeNoticeParam param);
	 
	 HomeNoticeResp updae(HomeNoticeParam param);
	 
	 int delete(HomeNoticeParam param);
}
