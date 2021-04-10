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

import com.home.cn.param.HomeHousingAttaParam;
import com.home.cn.resp.HomeHousingAttaResp;
import com.home.cn.service.HomeHousingAttaService;
import com.zhcx.itbus.common.BaseController;
import com.zhcx.itbus.common.ReturnObject;

@RestController
@RequestMapping("/homehousingatta")
@Api(tags = { "homehousingatta" }, value ="附件信息")
public class HomeHousingAttaController extends BaseController{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HomeHousingAttaService service;
	
	@RequestMapping(value = "/{uuid}", method = RequestMethod.GET)
	@ApiOperation(httpMethod = "GET",value = "获取信息")
	public List<HomeHousingAttaResp> query(
			@RequestParam(value = "uuid", required = false)  String uuid
			){
		List<HomeHousingAttaResp> respList = null;
		try {
			HomeHousingAttaParam param = new HomeHousingAttaParam();
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
	
	@RequestMapping(value = "/{HomeHousingAttaParam}", method = RequestMethod.POST)
	@ApiOperation(httpMethod = "POST", value = "新增信息")
	public ReturnObject<HomeHousingAttaResp> insert(@RequestBody HomeHousingAttaParam param){
		ReturnObject<HomeHousingAttaResp> ro = new ReturnObject<>();
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
	
	@RequestMapping(value = "/{HomeHousingAttaParam}", method = RequestMethod.PUT)
	@ApiOperation(httpMethod = "PUT",value = "修改信息")
	public HomeHousingAttaResp update(@RequestBody HomeHousingAttaParam param){
		HomeHousingAttaResp respLine = null;
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
	public ReturnObject<HomeHousingAttaResp> delete(
			@RequestParam(value = "uuid", required = false) String uuid){
		HomeHousingAttaParam param = new HomeHousingAttaParam();
		param.setUuid(Long.parseLong(uuid));
		ReturnObject<HomeHousingAttaResp> ro = new ReturnObject<>();
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
