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

import com.home.cn.param.HomeAuthUserParam;
import com.home.cn.resp.HomeAuthUserResp;
import com.home.cn.service.HomeAuthUserService;
import com.home.cn.utils.BeanUtils;
import com.home.cn.utils.Md5Tool;
import com.home.cn.utils.MobUtils;
import com.zhcx.itbus.common.BaseController;
import com.zhcx.itbus.common.ReturnObject;
import com.zhcx.platform.pagination.PageBean;

@RestController
@RequestMapping("/homeuser")
@Api(tags = { "homeuser"}, value ="用户信息")
public class HomeAuthUserController extends BaseController{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HomeAuthUserService service;
	
	@RequestMapping(value = "/{uuid,plotCode,plotName,loginName}", method = RequestMethod.GET)
	@ApiOperation(httpMethod = "GET",value = "查询用户信息")
	@ApiImplicitParams(value = {
			@ApiImplicitParam(name = "pageNo", value = "页码", required = false, paramType = "query", dataType = "String"),
			@ApiImplicitParam(name = "pageSize", value = "分页大小", required = false, paramType = "query", dataType = "String")})
	public ReturnObject<List<HomeAuthUserResp>> query(
			@RequestParam(value = "uuid", required = false)  String uuid , 
			@RequestParam(value = "plotCode", required = false) String plotCode,
			@RequestParam(value = "plotName", required = false) String plotName,
			@RequestParam(value = "loginName", required = false) String loginName,
			@RequestParam(value = "pageSize",required = false) String pageSize,
			@RequestParam(value = "pageNo",required = false) String pageNo
			){
		
		PageBean pageBean = null;
		List<HomeAuthUserResp> respList = null;
		ReturnObject<List<HomeAuthUserResp>> ro = new ReturnObject<List<HomeAuthUserResp>>();
		
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
			
			int total = service.count(param);
			//判断分页参数是否为空或者为-2 不是进行分页
			if ("-2".equals(pageSize) || pageSize == null || pageNo == null){
				respList = service.query(param);
			} else {
				pageBean = new PageBean(Integer.parseInt(pageNo), Integer.parseInt(pageSize), total);
				respList = service.query(param, pageBean.getOffset(), pageBean.getPageSize());
			}
			
			if(null != respList) {
				for (HomeAuthUserResp resp: respList) {
					resp.setPassword(null);
				}
			}
			
			ro.setData(respList);
			ro.setPageBean(pageBean);

		return ro;
	}
	@RequestMapping(value = "/{loginName, password}", method = RequestMethod.GET)
	@ApiOperation(httpMethod = "GET",value = "登陆信息")
	public ReturnObject<HomeAuthUserResp> login(
			@RequestParam(value = "loginName", required = true)  String loginName , 
			@RequestParam(value = "password", required = true) String password
			){
		
		HomeAuthUserResp user = null;
		List<HomeAuthUserResp> respList = null;
		ReturnObject<HomeAuthUserResp> ro = new ReturnObject<>();
		try {
			HomeAuthUserParam param = new HomeAuthUserParam();
			if(loginName != null && !"".equals(loginName)){
				param.setLoginName(loginName);
			}
			
			respList = service.query(param);
					
			if(null == respList || respList.size()==0) {
				ro.setStatusCode("1");
				ro.setResult("false");
				ro.setResultDesc("用户名或密码错误");
			} else {
				user = respList.get(0);
				if(Md5Tool.matchingPass(password, user.getPassword())){
					ro.setStatusCode("0");
					ro.setResult("true");
					ro.setResultDesc("登陆成功");
					ro.setData(user);
				} else {
					ro.setStatusCode("1");
					ro.setResult("false");
					ro.setResultDesc("用户名或密码错误");
					return ro;
				}
			}
		} catch (NumberFormatException e) {
			logger.error("查询失败"+e.getMessage());
			ro.setStatusCode("1");
			ro.setResult("false");
			ro.setResultDesc("用户名或密码错误");
		}
		
		return ro;
	}
	
	@RequestMapping(value = "/{loginName, password,newPassword,mobCode}", method = RequestMethod.POST)
	@ApiOperation(httpMethod = "POST", value = "修改密码")
	public ReturnObject<HomeAuthUserResp> insert(
			@RequestParam(value = "loginName", required = true)  String loginName,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "newPassword", required = true) String newPassword,
			@RequestParam(value = "mobCode", required = true) String mobCode
			){
		ReturnObject<HomeAuthUserResp> ro = new ReturnObject<>();
		try {
			HomeAuthUserParam param = new HomeAuthUserParam();
			boolean result = true;
			String resultMes = null;
			if(newPassword == null && "".equals(newPassword)){
				result = false;
				resultMes = "新密码不能为空";
			}
			if(password == null && "".equals(password)){
				result = false;
				resultMes = "旧密码不能为空";
			}
			if(loginName != null && !"".equals(loginName)){
				param.setLoginName(loginName);
			} else {
				result = false;
				resultMes = "用户名不能为空";
			}
			if(mobCode == null && "".equals(mobCode)){
				result = false;
				resultMes = "验证码不能为空";
			}
			if (result) {
				String resultCode = MobUtils.requestData(loginName, mobCode);
				if(resultCode.indexOf("200") == -1) {
					result = false;
					resultMes = "验证码错误";
				}				
			} 
			if (result) {
				
				List<HomeAuthUserResp> respList = service.query(param);				
				if(null == respList || respList.size()==0) {
					ro.setStatusCode("1");
					ro.setResult("false");
					ro.setResultDesc("用户名或密码错误");
					return ro;
				} else {
					HomeAuthUserResp resp = respList.get(0);
					
					if(Md5Tool.matchingPass(password, resp.getPassword())){
						resp.setPassword(Md5Tool.getMd5(newPassword));
						HomeAuthUserParam userParam = BeanUtils.copyProperties(HomeAuthUserParam.class, resp);
						resp = service.updae(userParam);
						ro.setStatusCode("0");
						ro.setResult("true");
						ro.setResultDesc("修改密码成功");
					} else {
						ro.setStatusCode("1");
						ro.setResult("false");
						ro.setResultDesc("用户名或密码错误");
						return ro;
					}
				}
			} else {
				ro.setStatusCode("1");
				ro.setResult("false");
				ro.setResultDesc(resultMes);
				return ro;
			}

		} catch (Exception e) {
			logger.error("添加失败"+e.getMessage());
		}
		return ro;
	}
	
	@RequestMapping(value = "/{HomeAuthUserParam}", method = RequestMethod.POST)
	@ApiOperation(httpMethod = "POST", value = "新增信息")
	public ReturnObject<HomeAuthUserResp> insert(@RequestBody HomeAuthUserParam param){
		ReturnObject<HomeAuthUserResp> ro = new ReturnObject<>();
		try {
			HomeAuthUserParam homeParam = new HomeAuthUserParam();
			homeParam.setLoginName(param.getLoginName());
			List<HomeAuthUserResp> respList = service.query(homeParam);
			
			if(null != respList) {
				ro.setStatusCode("1");
				ro.setResult("false");
				ro.setResultDesc("手机号码重复");
				return ro;
			}
			String mobCode = param.getMobCode();
			String loginName = param.getLoginName();
			
			if(loginName == null && "".equals(loginName)){
				ro.setStatusCode("1");
				ro.setResult("false");
				ro.setResultDesc("登陆名称不能为空");
				return ro;
			}
			
			if(mobCode == null && "".equals(mobCode)){
				ro.setStatusCode("1");
				ro.setResult("false");
				ro.setResultDesc("验证码不能为空");
				return ro;
			}
			
			String resultCode = MobUtils.requestData(loginName, mobCode);
			if(resultCode.indexOf("200") == -1) {
				ro.setStatusCode("1");
				ro.setResult("false");
				ro.setResultDesc("验证码错误");
				return ro;
			} 
			
			param.setPassword(Md5Tool.getMd5(param.getPassword()));
			int rows= service.insert(param);
			if(rows > 0 ){
				ro.setResultDesc("增加成功");
			} else {
				ro.setStatusCode("1");
				ro.setResult("false");
				ro.setResultDesc("增加失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("添加失败"+e.getMessage());
			ro.setStatusCode("1");
			ro.setResult("false");
			ro.setResultDesc("增加失败");
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
