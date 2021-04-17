package com.home.cn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.utils.BeanUtils;
import com.home.cn.mapper.HomeShopMapper;
import com.home.cn.model.HomeShop;
import com.home.cn.param.HomeShopParam;
import com.home.cn.resp.HomeShopResp;
import com.home.cn.service.HomeShopService;

@Service
public class HomeShopServiceImpl implements HomeShopService{

	@Autowired
	private HomeShopMapper mapper; 
	
	@Override
	public List<HomeShopResp> query(HomeShopParam param) {
		// TODO Auto-generated method stub
		List<HomeShop> list = mapper.query(param);
		List<HomeShopResp> respList = BeanUtils.copyPropertiesByClass(HomeShopResp.class, list);
		return respList;
	}
	
	@Override
	public List<HomeShopResp> query(HomeShopParam param, int skipResults, int maxResults) {
		
		RowBounds rowBounds = maxResults > 0 ? new RowBounds(skipResults, maxResults) : new RowBounds();
		List<HomeShopResp> list = new ArrayList<>();
		list = BeanUtils.copyPropertiesByClass(HomeShopResp.class, mapper.query(param, rowBounds));
				
		return list;
	}

	@Override
	public int count(HomeShopParam param) {
		
		return mapper.count(param);
	}

	@Override
	public int insert(HomeShopParam param) {
		// TODO Auto-generated method stub
		HomeShop record = BeanUtils.copyProperties(HomeShop.class, param);
		int rows = mapper.insertSelective(record);
		return rows;
	}

	@Override
	public HomeShopResp updae(HomeShopParam param) {
		// TODO Auto-generated method stub
		HomeShop record = BeanUtils.copyProperties(HomeShop.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeShopResp resp = new HomeShopResp();
		if(rows > 0){
			HomeShop  temp = mapper.selectByPrimaryKey(param.getShopId());
			resp = BeanUtils.copyProperties(HomeShopResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeShopParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeShopResp> respList = this.query(param);
		HomeShopResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeShopParam.class, resp);
//		param.setLineStatus("2");
		//执行修改
		HomeShopResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
