package com.home.cn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.mapper.HomeOrderMapper;
import com.home.cn.model.HomeOrder;
import com.home.cn.param.HomeOrderParam;
import com.home.cn.resp.HomeOrderResp;
import com.home.cn.service.HomeOrderService;
import com.home.cn.utils.BeanUtils;

@Service
public class HomeOrderServiceImpl implements HomeOrderService{

	@Autowired
	private HomeOrderMapper mapper; 
	
	@Override
	public List<HomeOrderResp> query(HomeOrderParam param) {
		// TODO Auto-generated method stub
		List<HomeOrder> list = mapper.query(param);
		List<HomeOrderResp> respList = BeanUtils.copyPropertiesByClass(HomeOrderResp.class, list);
		return respList;
	}
	
	@Override
	public List<HomeOrderResp> query(HomeOrderParam param, int skipResults, int maxResults) {
		
		RowBounds rowBounds = maxResults > 0 ? new RowBounds(skipResults, maxResults) : new RowBounds();
		List<HomeOrderResp> list = new ArrayList<>();
		list = BeanUtils.copyPropertiesByClass(HomeOrderResp.class, mapper.query(param, rowBounds));
				
		return list;
	}

	@Override
	public int count(HomeOrderParam param) {
		
		return mapper.count(param);
	}

	@Override
	public int insert(HomeOrderParam param) {
		// TODO Auto-generated method stub
		HomeOrder record = BeanUtils.copyProperties(HomeOrder.class, param);
		int rows = mapper.insertSelective(record);
		/*List<HomeOrderResp> respList = null;
		if(rows > 0){
			respList = this.query(param);
		}
		return respList.get(0);*/
		return rows;
	}

	@Override
	public HomeOrderResp updae(HomeOrderParam param) {
		// TODO Auto-generated method stub
		HomeOrder record = BeanUtils.copyProperties(HomeOrder.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeOrderResp resp = new HomeOrderResp();
		if(rows > 0){
			HomeOrder  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomeOrderResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeOrderParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeOrderResp> respList = this.query(param);
		HomeOrderResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeOrderParam.class, resp);
//		param.setLineStatus("2");
		//执行修改
		HomeOrderResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
