package com.home.cn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.mapper.HomeNoticeMapper;
import com.home.cn.model.HomeNotice;
import com.home.cn.param.HomeNoticeParam;
import com.home.cn.resp.HomeNoticeResp;
import com.home.cn.service.HomeNoticeService;
import com.home.cn.utils.BeanUtils;

@Service
public class HomeNoticeServiceImpl implements HomeNoticeService{

	@Autowired
	private HomeNoticeMapper mapper; 
	
	@Override
	public List<HomeNoticeResp> query(HomeNoticeParam param) {
		// TODO Auto-generated method stub
		List<HomeNotice> list = mapper.query(param);
		List<HomeNoticeResp> respList = BeanUtils.copyPropertiesByClass(HomeNoticeResp.class, list);
		return respList;
	}
	
	@Override
	public List<HomeNoticeResp> query(HomeNoticeParam param, int skipResults, int maxResults) {
		
		RowBounds rowBounds = maxResults > 0 ? new RowBounds(skipResults, maxResults) : new RowBounds();
		List<HomeNoticeResp> list = new ArrayList<>();
		list = BeanUtils.copyPropertiesByClass(HomeNoticeResp.class, mapper.query(param, rowBounds));
				
		return list;
	}

	@Override
	public int count(HomeNoticeParam param) {
		
		return mapper.count(param);
	}

	@Override
	public int insert(HomeNoticeParam param) {
		// TODO Auto-generated method stub
		HomeNotice record = BeanUtils.copyProperties(HomeNotice.class, param);
		int rows = mapper.insertSelective(record);
		/*List<HomeNoticeResp> respList = null;
		if(rows > 0){
			respList = this.query(param);
		}
		return respList.get(0);*/
		return rows;
	}

	@Override
	public HomeNoticeResp updae(HomeNoticeParam param) {
		// TODO Auto-generated method stub
		HomeNotice record = BeanUtils.copyProperties(HomeNotice.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeNoticeResp resp = new HomeNoticeResp();
		if(rows > 0){
			HomeNotice  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomeNoticeResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeNoticeParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeNoticeResp> respList = this.query(param);
		HomeNoticeResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeNoticeParam.class, resp);
//		param.setLineStatus("2");
		//执行修改
		HomeNoticeResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
