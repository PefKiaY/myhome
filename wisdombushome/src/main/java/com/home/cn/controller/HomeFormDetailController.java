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

import com.home.cn.param.HomeFormDetailParam;
import com.home.cn.resp.HomeFormDetailResp;
import com.home.cn.service.HomeFormDetailService;
import com.zhcx.itbus.common.ReturnObject;
import com.zhcx.itbus.common.controller.BaseController;

@RestController
@RequestMapping("/homeformdetail")
@Api(tags = { "homeformdetail" }, value ="表单详情")
public class HomeFormDetailController extends BaseController{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HomeFormDetailService service;
	
	@RequestMapping(value = "/{uuid,plotCode,plotName}", method = RequestMethod.GET)
	@ApiOperation(httpMethod = "GET",value = "获取信息")
	public List<HomeFormDetailResp> query(
			@RequestParam(value = "uuid", required = false)  String uuid , 
			@RequestParam(value = "plotCode", required = false) String plotCode,
			@RequestParam(value = "plotName", required = false) String plotName
			){
		List<HomeFormDetailResp> respList = null;
		try {
			HomeFormDetailParam param = new HomeFormDetailParam();
			if(plotCode != null && !"".equals(plotCode)){
				param.setPlotCode(Long.parseLong(plotCode));
			}
			if(plotName != null && !"".equals(plotName)){
				param.setPlotName(plotName);
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
	
	@RequestMapping(value = "/{HomeFormDetailParam}", method = RequestMethod.POST)
	@ApiOperation(httpMethod = "POST", value = "新增信息")
	public ReturnObject<HomeFormDetailResp> insert(@RequestBody HomeFormDetailParam param){
		ReturnObject<HomeFormDetailResp> ro = new ReturnObject<>();
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
	
	@RequestMapping(value = "/{HomeFormDetailParam}", method = RequestMethod.PUT)
	@ApiOperation(httpMethod = "PUT",value = "修改信息")
	public HomeFormDetailResp update(@RequestBody HomeFormDetailParam param){
		HomeFormDetailResp respLine = null;
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
	public ReturnObject<HomeFormDetailResp> delete(
			@RequestParam(value = "uuid", required = false) String uuid){
		HomeFormDetailParam param = new HomeFormDetailParam();
		param.setUuid(Long.parseLong(uuid));
		ReturnObject<HomeFormDetailResp> ro = new ReturnObject<>();
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
