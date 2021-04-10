package com.home.cn.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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

import com.home.cn.param.HomeOrderParam;
import com.home.cn.resp.HomeOrderResp;
import com.home.cn.service.HomeOrderService;
import com.zhcx.itbus.common.BaseController;
import com.zhcx.itbus.common.ReturnObject;
import com.zhcx.platform.pagination.PageBean;

@RestController
@RequestMapping("/homeorder")
@Api(tags = { "homeorder" }, value ="订单信息")
public class HomeOrderController extends BaseController{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HomeOrderService service;
	
	@RequestMapping(value = "/{uuid,plotCode,plotName}", method = RequestMethod.GET)
	@ApiOperation(httpMethod = "GET",value = "获取信息")
	@ApiImplicitParams(value = {
			@ApiImplicitParam(name = "pageNo", value = "页码", required = false, paramType = "query", dataType = "String"),
			@ApiImplicitParam(name = "pageSize", value = "分页大小", required = false, paramType = "query", dataType = "String")})
	public ReturnObject<List<HomeOrderResp>> query(
			@RequestParam(value = "uuid", required = false)  String uuid , 
			@RequestParam(value = "plotCode", required = false) String plotCode,
			@RequestParam(value = "plotName", required = false) String plotName,
			@RequestParam(value = "pageSize",required = false) String pageSize,
			@RequestParam(value = "pageNo",required = false) String pageNo
			){
		List<HomeOrderResp> respList = null;
		PageBean pageBean = null;
		ReturnObject<List<HomeOrderResp>> ro = new ReturnObject<List<HomeOrderResp>>();
		
		HomeOrderParam param = new HomeOrderParam();
		if(plotCode != null && !"".equals(plotCode)){
			param.setPlotCode(Long.parseLong(plotCode));
		}
		if(plotName != null && !"".equals(plotName)){
			param.setPlotName(plotName);
		}
		if(uuid != null && !"".equals(uuid)){
			param.setUuid(Long.parseLong(uuid));
		}

		//判断分页参数是否为空或者为-2 不是进行分页
		if ("-2".equals(pageSize) || pageSize == null || pageNo == null){
			respList = service.query(param);
		} else {
			int total = service.count(param);
			pageBean = new PageBean(Integer.parseInt(pageNo), Integer.parseInt(pageSize), total);
			respList = service.query(param, pageBean.getOffset(), pageBean.getPageSize());
		}
		
		ro.setData(respList);
		ro.setPageBean(pageBean);

		return ro;
	}
	
	@RequestMapping(value = "/{HomeOrderParam}", method = RequestMethod.POST)
	@ApiOperation(httpMethod = "POST", value = "新增信息")
	public ReturnObject<HomeOrderResp> insert(@RequestBody HomeOrderParam param){
		ReturnObject<HomeOrderResp> ro = new ReturnObject<>();
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
	
	@RequestMapping(value = "/{HomeOrderParam}", method = RequestMethod.PUT)
	@ApiOperation(httpMethod = "PUT",value = "修改信息")
	public HomeOrderResp update(@RequestBody HomeOrderParam param){
		HomeOrderResp respLine = null;
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
	public ReturnObject<HomeOrderResp> delete(
			@RequestParam(value = "uuid", required = false) String uuid){
		HomeOrderParam param = new HomeOrderParam();
		param.setUuid(Long.parseLong(uuid));
		ReturnObject<HomeOrderResp> ro = new ReturnObject<>();
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
