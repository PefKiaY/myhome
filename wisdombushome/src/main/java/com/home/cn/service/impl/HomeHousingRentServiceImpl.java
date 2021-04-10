package com.home.cn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.mapper.HomeHousingRentMapper;
import com.home.cn.model.HomeHousingRent;
import com.home.cn.param.HomeHousingRentParam;
import com.home.cn.resp.HomeHousingRentResp;
import com.home.cn.service.HomeHousingRentService;
import com.home.cn.utils.BeanUtils;

@Service
public class HomeHousingRentServiceImpl implements HomeHousingRentService{

	@Autowired
	private HomeHousingRentMapper mapper; 
	
	@Override
	public List<HomeHousingRentResp> query(HomeHousingRentParam param) {
		// TODO Auto-generated method stub
		List<HomeHousingRent> list = mapper.query(param);
		List<HomeHousingRentResp> respList = BeanUtils.copyPropertiesByClass(HomeHousingRentResp.class, list);
		return respList;
	}
	
	@Override
	public List<HomeHousingRentResp> query(HomeHousingRentParam param, int skipResults, int maxResults) {
		
		RowBounds rowBounds = maxResults > 0 ? new RowBounds(skipResults, maxResults) : new RowBounds();
		List<HomeHousingRentResp> list = new ArrayList<>();
		list = BeanUtils.copyPropertiesByClass(HomeHousingRentResp.class, mapper.query(param, rowBounds));
				
		return list;
	}

	@Override
	public int count(HomeHousingRentParam param) {
		
		return mapper.count(param);
	}

	@Override
	public int insert(HomeHousingRentParam param) {
		// TODO Auto-generated method stub
		HomeHousingRent record = BeanUtils.copyProperties(HomeHousingRent.class, param);
		int rows = mapper.insertSelective(record);
		return rows;
	}

	@Override
	public HomeHousingRentResp updae(HomeHousingRentParam param) {
		// TODO Auto-generated method stub
		HomeHousingRent record = BeanUtils.copyProperties(HomeHousingRent.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeHousingRentResp resp = new HomeHousingRentResp();
		if(rows > 0){
			HomeHousingRent  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomeHousingRentResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeHousingRentParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeHousingRentResp> respList = this.query(param);
		HomeHousingRentResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeHousingRentParam.class, resp);
//		param.setLineStatus("2");
		//执行修改
		HomeHousingRentResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
