package com.home.cn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.mapper.HomeJobMapper;
import com.home.cn.model.HomeJob;
import com.home.cn.param.HomeJobParam;
import com.home.cn.resp.HomeJobResp;
import com.home.cn.service.HomeJobService;
import com.home.cn.utils.BeanUtils;

@Service
public class HomeJobServiceImpl implements HomeJobService{

	@Autowired
	private HomeJobMapper mapper; 
	
	@Override
	public List<HomeJobResp> query(HomeJobParam param) {
		// TODO Auto-generated method stub
		List<HomeJob> list = mapper.query(param);
		List<HomeJobResp> respList = BeanUtils.copyPropertiesByClass(HomeJobResp.class, list);
		return respList;
	}
	
	@Override
	public List<HomeJobResp> query(HomeJobParam param, int skipResults, int maxResults) {
		
		RowBounds rowBounds = maxResults > 0 ? new RowBounds(skipResults, maxResults) : new RowBounds();
		List<HomeJobResp> list = new ArrayList<>();
		list = BeanUtils.copyPropertiesByClass(HomeJobResp.class, mapper.query(param, rowBounds));
				
		return list;
	}

	@Override
	public int count(HomeJobParam param) {
		
		return mapper.count(param);
	}

	@Override
	public int insert(HomeJobParam param) {
		// TODO Auto-generated method stub
		HomeJob record = BeanUtils.copyProperties(HomeJob.class, param);
		int rows = mapper.insertSelective(record);
		return rows;
	}

	@Override
	public HomeJobResp updae(HomeJobParam param) {
		// TODO Auto-generated method stub
		HomeJob record = BeanUtils.copyProperties(HomeJob.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeJobResp resp = new HomeJobResp();
		if(rows > 0){
			HomeJob  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomeJobResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeJobParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeJobResp> respList = this.query(param);
		HomeJobResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeJobParam.class, resp);
//		param.setLineStatus("2");
		//执行修改
		HomeJobResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
