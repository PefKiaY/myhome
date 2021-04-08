package com.home.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.utils.BeanUtils;
import com.home.cn.mapper.HomeDictionaryCountyCityMapper;
import com.home.cn.model.HomeDictionaryCountyCity;
import com.home.cn.param.HomeDictionaryCountyCityParam;
import com.home.cn.resp.HomeDictionaryCountyCityResp;
import com.home.cn.service.HomeDictionaryCountyCityService;

@Service
public class HomeDictionaryCountyCityServiceImpl implements HomeDictionaryCountyCityService{

	@Autowired
	private HomeDictionaryCountyCityMapper mapper; 
	
	@Override
	public List<HomeDictionaryCountyCityResp> query(HomeDictionaryCountyCityParam param) {
		// TODO Auto-generated method stub
		List<HomeDictionaryCountyCity> list = mapper.query(param);
		List<HomeDictionaryCountyCityResp> respList = BeanUtils.copyPropertiesByClass(HomeDictionaryCountyCityResp.class, list);
		return respList;
	}

	@Override
	public int insert(HomeDictionaryCountyCityParam param) {
		// TODO Auto-generated method stub
		HomeDictionaryCountyCity record = BeanUtils.copyProperties(HomeDictionaryCountyCity.class, param);
		int rows = mapper.insertSelective(record);
		return rows;
	}

	@Override
	public HomeDictionaryCountyCityResp updae(HomeDictionaryCountyCityParam param) {
		// TODO Auto-generated method stub
		HomeDictionaryCountyCity record = BeanUtils.copyProperties(HomeDictionaryCountyCity.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeDictionaryCountyCityResp resp = new HomeDictionaryCountyCityResp();
		if(rows > 0){
			HomeDictionaryCountyCity  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomeDictionaryCountyCityResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeDictionaryCountyCityParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeDictionaryCountyCityResp> respList = this.query(param);
		HomeDictionaryCountyCityResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeDictionaryCountyCityParam.class, resp);
//		param.setLineStatus("2");
		//执行修改
		HomeDictionaryCountyCityResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
