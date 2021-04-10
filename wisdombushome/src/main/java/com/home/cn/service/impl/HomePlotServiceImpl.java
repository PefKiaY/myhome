package com.home.cn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.utils.BeanUtils;
import com.home.cn.mapper.HomePlotMapper;
import com.home.cn.model.HomePlot;
import com.home.cn.param.HomePlotParam;
import com.home.cn.resp.HomePlotResp;
import com.home.cn.service.HomePlotService;

@Service
public class HomePlotServiceImpl implements HomePlotService{

	@Autowired
	private HomePlotMapper mapper; 
	
	@Override
	public List<HomePlotResp> query(HomePlotParam param, int skipResults, int maxResults) {
		
		RowBounds rowBounds = maxResults > 0 ? new RowBounds(skipResults, maxResults) : new RowBounds();
		List<HomePlotResp> list = new ArrayList<>();
		list = BeanUtils.copyPropertiesByClass(HomePlotResp.class, mapper.query(param, rowBounds));
				
		return list;
	}

	@Override
	public int count(HomePlotParam param) {
		
		return mapper.count(param);
	}
	
	@Override
	public List<HomePlotResp> query(HomePlotParam param) {
		// TODO Auto-generated method stub
		List<HomePlot> list = mapper.query(param);
		List<HomePlotResp> respList = BeanUtils.copyPropertiesByClass(HomePlotResp.class, list);
		return respList;
	}

	@Override
	public int insert(HomePlotParam param) {
		// TODO Auto-generated method stub
		HomePlot record = BeanUtils.copyProperties(HomePlot.class, param);
		int rows = mapper.insertSelective(record);
		return rows;
	}

	@Override
	public HomePlotResp updae(HomePlotParam param) {
		// TODO Auto-generated method stub
		HomePlot record = BeanUtils.copyProperties(HomePlot.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomePlotResp resp = new HomePlotResp();
		if(rows > 0){
			HomePlot  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomePlotResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomePlotParam param) {
		int rows = 0;
		//拿到需要删除的数据
		List<HomePlotResp> respList = this.query(param);
		HomePlotResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomePlotParam.class, resp);
		//执行修改
		HomePlotResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}
	
}
