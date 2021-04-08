package com.home.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.utils.BeanUtils;
import com.home.cn.mapper.HomeHousingAttaMapper;
import com.home.cn.model.HomeHousingAtta;
import com.home.cn.param.HomeHousingAttaParam;
import com.home.cn.resp.HomeHousingAttaResp;
import com.home.cn.service.HomeHousingAttaService;

@Service
public class HomeHousingAttaServiceImpl implements HomeHousingAttaService{

	@Autowired
	private HomeHousingAttaMapper mapper; 
	
	@Override
	public List<HomeHousingAttaResp> query(HomeHousingAttaParam param) {
		// TODO Auto-generated method stub
		List<HomeHousingAtta> list = mapper.query(param);
		List<HomeHousingAttaResp> respList = BeanUtils.copyPropertiesByClass(HomeHousingAttaResp.class, list);
		return respList;
	}

	@Override
	public int insert(HomeHousingAttaParam param) {
		// TODO Auto-generated method stub
		HomeHousingAtta record = BeanUtils.copyProperties(HomeHousingAtta.class, param);
		int rows = mapper.insertSelective(record);
		return rows;
	}

	@Override
	public HomeHousingAttaResp updae(HomeHousingAttaParam param) {
		// TODO Auto-generated method stub
		HomeHousingAtta record = BeanUtils.copyProperties(HomeHousingAtta.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeHousingAttaResp resp = new HomeHousingAttaResp();
		if(rows > 0){
			HomeHousingAtta  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomeHousingAttaResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeHousingAttaParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeHousingAttaResp> respList = this.query(param);
		HomeHousingAttaResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeHousingAttaParam.class, resp);
//		param.setLineStatus("2");
		//执行修改
		HomeHousingAttaResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
