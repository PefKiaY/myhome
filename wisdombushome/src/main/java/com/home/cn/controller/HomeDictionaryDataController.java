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

import com.home.cn.param.HomeDictionaryDataParam;
import com.home.cn.resp.HomeDictionaryDataResp;
import com.home.cn.service.HomeDictionaryDataService;
import com.zhcx.itbus.common.BaseController;
import com.zhcx.itbus.common.ReturnObject;

@RestController
@RequestMapping("/homedata")
@Api(tags = { "homedata" }, value ="数据字典信息")
public class HomeDictionaryDataController extends BaseController{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HomeDictionaryDataService service;
	
	@RequestMapping(value = "/{HomeDictionaryDataParam}", method = RequestMethod.POST)
	@ApiOperation(httpMethod = "POST", value = "新增信息")
	public ReturnObject<HomeDictionaryDataResp> insert(@RequestBody HomeDictionaryDataParam param){
		ReturnObject<HomeDictionaryDataResp> ro = new ReturnObject<>();
		try {
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
	
	@RequestMapping(value = "/{uuid,code,type,superCode}", method = RequestMethod.GET)
	@ApiOperation(httpMethod = "GET",value = "获取信息")
	public List<HomeDictionaryDataResp> query(
			@RequestParam(value = "uuid", required = false)  String uuid,
			@RequestParam(value = "code", required = false) String code,
			@RequestParam(value = "type", required = false) String type,
			@RequestParam(value = "superCode", required = false) String superCode){
		List<HomeDictionaryDataResp> respList = null;
		try {
			HomeDictionaryDataParam param = new HomeDictionaryDataParam();
			if(code != null && !"".equals(code)){
				param.setCode(code);
			}
			if(uuid != null && !"".equals(uuid)){
				param.setUuid(Long.parseLong(uuid));
			}
			if(type != null && !"".equals(type)){
				param.setType(type);
			}
			if(superCode != null && !"".equals(superCode)){
				param.setSuperCode(superCode);
			}
			respList = service.query(param);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			logger.error("查询失败"+e.getMessage());
		}
		return respList;
	}
	
	@RequestMapping(value = "/{HomeDictionaryDataParam}", method = RequestMethod.PUT)
	@ApiOperation(httpMethod = "PUT",value = "修改信息")
	public HomeDictionaryDataResp update(@RequestBody HomeDictionaryDataParam param){
		HomeDictionaryDataResp respLine = null;
		try {
			respLine = service.updae(param);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("修改失败"+e.getMessage());
		}
		return respLine;
	}
	
	
	@RequestMapping(value = "/{uuid}", method = RequestMethod.DELETE)
	@ApiOperation(httpMethod = "DELETE",value = "删除指定信息")
	public ReturnObject<HomeDictionaryDataResp> delete(
			@RequestParam(value = "uuid", required = false) String uuid){
		HomeDictionaryDataParam param = new HomeDictionaryDataParam();
		param.setUuid(Long.parseLong(uuid));
		ReturnObject<HomeDictionaryDataResp> ro = new ReturnObject<>();
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
