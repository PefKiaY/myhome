package com.home.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.utils.BeanUtils;
import com.home.cn.mapper.HomeDictionaryProvinceCityMapper;
import com.home.cn.model.HomeDictionaryProvinceCity;
import com.home.cn.param.HomeDictionaryProvinceCityParam;
import com.home.cn.resp.HomeDictionaryProvinceCityResp;
import com.home.cn.service.HomeDictionaryProvinceCityService;

@Service
public class HomeDictionaryProvinceCityServiceImpl implements HomeDictionaryProvinceCityService{

	@Autowired
	private HomeDictionaryProvinceCityMapper mapper; 
	
	@Override
	public List<HomeDictionaryProvinceCityResp> query(HomeDictionaryProvinceCityParam param) {
		// TODO Auto-generated method stub
		List<HomeDictionaryProvinceCity> list = mapper.query(param);
		List<HomeDictionaryProvinceCityResp> respList = BeanUtils.copyPropertiesByClass(HomeDictionaryProvinceCityResp.class, list);
		return respList;
	}

	@Override
	public int insert(HomeDictionaryProvinceCityParam param) {
		// TODO Auto-generated method stub
		HomeDictionaryProvinceCity record = BeanUtils.copyProperties(HomeDictionaryProvinceCity.class, param);
		int rows = mapper.insertSelective(record);
		return rows;
	}

	@Override
	public HomeDictionaryProvinceCityResp updae(HomeDictionaryProvinceCityParam param) {
		// TODO Auto-generated method stub
		HomeDictionaryProvinceCity record = BeanUtils.copyProperties(HomeDictionaryProvinceCity.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeDictionaryProvinceCityResp resp = new HomeDictionaryProvinceCityResp();
		if(rows > 0){
			HomeDictionaryProvinceCity  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomeDictionaryProvinceCityResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeDictionaryProvinceCityParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeDictionaryProvinceCityResp> respList = this.query(param);
		HomeDictionaryProvinceCityResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeDictionaryProvinceCityParam.class, resp);
//		param.setLineStatus("2");
		//执行修改
		HomeDictionaryProvinceCityResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
