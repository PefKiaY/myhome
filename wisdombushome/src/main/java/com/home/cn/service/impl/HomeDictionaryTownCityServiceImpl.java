package com.home.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.utils.BeanUtils;
import com.home.cn.mapper.HomeDictionaryTownCityMapper;
import com.home.cn.model.HomeDictionaryTownCity;
import com.home.cn.param.HomeDictionaryTownCityParam;
import com.home.cn.resp.HomeDictionaryTownCityResp;
import com.home.cn.service.HomeDictionaryTownCityService;

@Service
public class HomeDictionaryTownCityServiceImpl implements HomeDictionaryTownCityService{

	@Autowired
	private HomeDictionaryTownCityMapper mapper; 
	
	@Override
	public List<HomeDictionaryTownCityResp> query(HomeDictionaryTownCityParam param) {
		// TODO Auto-generated method stub
		List<HomeDictionaryTownCity> list = mapper.query(param);
		List<HomeDictionaryTownCityResp> respList = BeanUtils.copyPropertiesByClass(HomeDictionaryTownCityResp.class, list);
		return respList;
	}

	@Override
	public int insert(HomeDictionaryTownCityParam param) {
		// TODO Auto-generated method stub
		HomeDictionaryTownCity record = BeanUtils.copyProperties(HomeDictionaryTownCity.class, param);
		int rows = mapper.insertSelective(record);
		return rows;
	}

	@Override
	public HomeDictionaryTownCityResp updae(HomeDictionaryTownCityParam param) {
		// TODO Auto-generated method stub
		HomeDictionaryTownCity record = BeanUtils.copyProperties(HomeDictionaryTownCity.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeDictionaryTownCityResp resp = new HomeDictionaryTownCityResp();
		if(rows > 0){
			HomeDictionaryTownCity  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomeDictionaryTownCityResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeDictionaryTownCityParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeDictionaryTownCityResp> respList = this.query(param);
		HomeDictionaryTownCityResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeDictionaryTownCityParam.class, resp);
//		param.setLineStatus("2");
		//执行修改
		HomeDictionaryTownCityResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
