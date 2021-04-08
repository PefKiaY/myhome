package com.home.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.cn.utils.BeanUtils;
import com.home.cn.mapper.HomeAuthUserMapper;
import com.home.cn.model.HomeAuthUser;
import com.home.cn.param.HomeAuthUserParam;
import com.home.cn.resp.HomeAuthUserResp;
import com.home.cn.service.HomeAuthUserService;

@Service
public class HomeAuthUserServiceImpl implements HomeAuthUserService{

	@Autowired
	private HomeAuthUserMapper mapper; 
	
	@Override
	public List<HomeAuthUserResp> query(HomeAuthUserParam param) {
		// TODO Auto-generated method stub
		List<HomeAuthUser> list = mapper.query(param);
		List<HomeAuthUserResp> respList = BeanUtils.copyPropertiesByClass(HomeAuthUserResp.class, list);
		return respList;
	}

	@Override
	public int insert(HomeAuthUserParam param) {
		// TODO Auto-generated method stub
		HomeAuthUser record = BeanUtils.copyProperties(HomeAuthUser.class, param);
		int rows = mapper.insertSelective(record);
		/*List<HomeAuthUserResp> respList = null;
		if(rows > 0){
			respList = this.query(param);
		}
		return respList.get(0);*/
		return rows;
	}

	@Override
	public HomeAuthUserResp updae(HomeAuthUserParam param) {
		// TODO Auto-generated method stub
		HomeAuthUser record = BeanUtils.copyProperties(HomeAuthUser.class, param);
		int rows = mapper.updateByPrimaryKeySelective(record);
		HomeAuthUserResp resp = new HomeAuthUserResp();
		if(rows > 0){
			HomeAuthUser  temp = mapper.selectByPrimaryKey(param.getUuid());
			resp = BeanUtils.copyProperties(HomeAuthUserResp.class, temp);
		}
		return resp;
	}

	/**
	 * 线路删除只做逻辑删除  不做物理删除
	 */
	@Override
	public int delete(HomeAuthUserParam param) {
		// TODO Auto-generated method stub
		int rows = 0;
		//拿到需要删除的数据
		List<HomeAuthUserResp> respList = this.query(param);
		HomeAuthUserResp resp = respList.get(0);
		//设置线路状态
		param = BeanUtils.copyProperties(HomeAuthUserParam.class, resp);
		param.setUserStatus(Short.MIN_VALUE);
		//执行修改
		HomeAuthUserResp lineResp = this.updae(param);
		if(lineResp != null){
			rows += 1;
		}
		return rows;
	}

	
}
