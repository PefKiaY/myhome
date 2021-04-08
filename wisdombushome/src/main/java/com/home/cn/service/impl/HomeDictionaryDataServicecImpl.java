package com.home.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.mapper.HomeDictionaryDataMapper;
import com.home.cn.model.HomeDictionaryData;
import com.home.cn.param.HomeDictionaryDataParam;
import com.home.cn.resp.HomeDictionaryDataResp;
import com.home.cn.service.HomeDictionaryDataService;
import com.home.cn.utils.BeanUtils;

@Service
public class HomeDictionaryDataServicecImpl implements HomeDictionaryDataService{

	@Autowired
	private HomeDictionaryDataMapper mapper; 
	
	@Override
	public List<HomeDictionaryDataResp> query(HomeDictionaryDataParam param) {
		// TODO Auto-generated method stub
		List<HomeDictionaryData> list = mapper.query(param);
		List<HomeDictionaryDataResp> respList = BeanUtils.copyPropertiesByClass(HomeDictionaryDataResp.class, list);
		return respList;
	}

	@Override
	public int insert(HomeDictionaryDataParam param) {
		// TODO Auto-generated method stub
		HomeDictionaryData record = BeanUtils.copyProperties(HomeDictionaryData.class, param);
		int rows = mapper.insertSelective(record);
		/*List<HomeDictionaryDataResp> respList = null;
		if(rows > 0){
			respList = this.query(param);
		}
		return respList.get(0);*/
		return rows;
	}

	@Override
	public HomeDictionaryDataResp updae(HomeDictionaryDataParam param) {
		// TODO Auto-generated method stub
		HomeDictionaryData record = BeanUtils.copyProperties(HomeDictionaryData.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeDictionaryDataResp resp = new HomeDictionaryDataResp();
		if(rows > 0){
			HomeDictionaryData  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomeDictionaryDataResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeDictionaryDataParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeDictionaryDataResp> respList = this.query(param);
		HomeDictionaryDataResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeDictionaryDataParam.class, resp);
//		param.setLineStatus("2");
		//执行修改
		HomeDictionaryDataResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
