package com.home.cn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.mapper.HomeFormDetailMapper;
import com.home.cn.model.HomeFormDetail;
import com.home.cn.param.HomeFormDetailParam;
import com.home.cn.resp.HomeFormDetailResp;
import com.home.cn.service.HomeFormDetailService;
import com.home.cn.utils.BeanUtils;

@Service
public class HomeFormDetailServiceImpl implements HomeFormDetailService{

	@Autowired
	private HomeFormDetailMapper mapper; 
	
	@Override
	public List<HomeFormDetailResp> query(HomeFormDetailParam param) {
		// TODO Auto-generated method stub
		List<HomeFormDetail> list = mapper.query(param);
		List<HomeFormDetailResp> respList = BeanUtils.copyPropertiesByClass(HomeFormDetailResp.class, list);
		return respList;
	}
	
	@Override
	public List<HomeFormDetailResp> query(HomeFormDetailParam param, int skipResults, int maxResults) {
		
		RowBounds rowBounds = maxResults > 0 ? new RowBounds(skipResults, maxResults) : new RowBounds();
		List<HomeFormDetailResp> list = new ArrayList<>();
		list = BeanUtils.copyPropertiesByClass(HomeFormDetailResp.class, mapper.query(param, rowBounds));
				
		return list;
	}

	@Override
	public int count(HomeFormDetailParam param) {
		
		return mapper.count(param);
	}

	@Override
	public int insert(HomeFormDetailParam param) {
		// TODO Auto-generated method stub
		HomeFormDetail record = BeanUtils.copyProperties(HomeFormDetail.class, param);
		int rows = mapper.insertSelective(record);
		return rows;
	}

	@Override
	public HomeFormDetailResp updae(HomeFormDetailParam param) {
		// TODO Auto-generated method stub
		HomeFormDetail record = BeanUtils.copyProperties(HomeFormDetail.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeFormDetailResp resp = new HomeFormDetailResp();
		if(rows > 0){
			HomeFormDetail  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomeFormDetailResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeFormDetailParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeFormDetailResp> respList = this.query(param);
		HomeFormDetailResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeFormDetailParam.class, resp);
//		param.setLineStatus("2");
		//执行修改
		HomeFormDetailResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
