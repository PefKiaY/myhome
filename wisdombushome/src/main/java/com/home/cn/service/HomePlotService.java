package com.home.cn.service;

import java.util.List;

import com.home.cn.param.HomePlotParam;
import com.home.cn.resp.HomePlotResp;

public interface HomePlotService {
	
	 List<HomePlotResp>query(HomePlotParam param);

	 int insert(HomePlotParam param);
	 
	 HomePlotResp updae(HomePlotParam param);
	 
	 int delete(HomePlotParam param);
}
