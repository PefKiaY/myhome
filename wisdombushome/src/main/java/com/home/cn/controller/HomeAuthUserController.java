package com.home.cn.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.home.cn.param.HomeAuthUserParam;
import com.home.cn.resp.HomeAuthUserResp;
import com.home.cn.service.HomeAuthUserService;
import com.zhcx.itbus.common.ReturnObject;
import com.zhcx.itbus.common.controller.BaseController;
import com.zhcx.itbus.utils.Md5Tool;

@RestController
@RequestMapping("/homeuser")
@Api(tags = { "homeuser"}, value ="用户信息")
public class HomeAuthUserController extends BaseController{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HomeAuthUserService service;
	
	@RequestMapping(value = "/{uuid,plotCode,plotName,loginName}", method = RequestMethod.GET)
	@ApiOperation(httpMethod = "GET",value = "获取信息")
	public List<HomeAuthUserResp> query(
			@RequestParam(value = "uuid", required = false)  String uuid , 
			@RequestParam(value = "plotCode", required = false) String plotCode,
			@RequestParam(value = "plotName", required = false) String plotName,
			@RequestParam(value = "loginName", required = false) String loginName
			){
		List<HomeAuthUserResp> respList = null;
		try {
			HomeAuthUserParam param = new HomeAuthUserParam();
			if(plotCode != null && !"".equals(plotCode)){
				param.setPlotCode(Long.parseLong(plotCode));
			}
			if(plotName != null && !"".equals(plotName)){
				param.setPlotName(plotName);
			}
			if(loginName != null && !"".equals(loginName)){
				param.setLoginName(loginName);
			}
			if(uuid != null && !"".equals(uuid)){
				param.setUuid(Long.parseLong(uuid));
			}
			respList = service.query(param);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			logger.error("查询失败"+e.getMessage());
		}
		return respList;
	}
	@RequestMapping(value = "/{loginName, password}", method = RequestMethod.GET)
	@ApiOperation(httpMethod = "GET",value = "获取信息")
	public HomeAuthUserResp login(
			@RequestParam(value = "loginName", required = true)  String loginName , 
			@RequestParam(value = "password", required = true) String password
			){
		List<HomeAuthUserResp> respList = null;
		try {
			HomeAuthUserParam param = new HomeAuthUserParam();
			if(password != null && !"".equals(password)){
				param.setPassword(password);
			}
			if(loginName != null && !"".equals(loginName)){
				param.setLoginName(loginName);
			}
			
			respList = service.query(param);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			logger.error("查询失败"+e.getMessage());
		}
		HomeAuthUserResp user = null;
		if(respList != null && respList.size() > 0){
			user = respList.get(0);
		}
		return user;
	}
	@RequestMapping(value = "/{HomeAuthUserParam}", method = RequestMethod.POST)
	@ApiOperation(httpMethod = "POST", value = "新增信息")
	public ReturnObject<HomeAuthUserResp> insert(@RequestBody HomeAuthUserParam param){
		ReturnObject<HomeAuthUserResp> ro = new ReturnObject<>();
		try {
			param.setPassword(Md5Tool.getMd5(param.getPassword()));
			int rows= service.insert(param);
			if(rows > 0 ){
				ro.setResultDesc("增加成功");
			}else{
				ro.setStatusCode("1");
				ro.setResult("false");
				ro.setResultDesc("增加失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("添加失败"+e.getMessage());
		}
		return ro;
	}
	
	@RequestMapping(value = "/{HomeAuthUserParam}", method = RequestMethod.PUT)
	@ApiOperation(httpMethod = "PUT",value = "修改信息")
	public HomeAuthUserResp update(@RequestBody HomeAuthUserParam param){
		
		HomeAuthUserResp respLine = null;
		try {
			
			param.setPassword(Md5Tool.getMd5(param.getNewPassword()));
			respLine = service.updae(param);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("修改失败"+e.getMessage());
		}
		return respLine;
	}
	
	
	@RequestMapping(value = "/{uuid}", method = RequestMethod.DELETE)
	@ApiOperation(httpMethod = "DELETE",value = "删除指定信息")
	public ReturnObject<HomeAuthUserResp> delete(
			@RequestParam(value = "uuid", required = false) String uuid){
		HomeAuthUserParam param = new HomeAuthUserParam();
		param.setUuid(Long.parseLong(uuid));
		ReturnObject<HomeAuthUserResp> ro = new ReturnObject<>();
		try {
			int rows = service.delete(param);
			if(rows > 0 ){
				ro.setResultDesc("删除成功");
			}else{
				ro.setStatusCode("1");
				ro.setResult("false");
				ro.setResultDesc("删除失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("删除失败"+e.getMessage());
		}
		return ro;
	}
}
