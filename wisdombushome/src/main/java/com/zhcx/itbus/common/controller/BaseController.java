package com.zhcx.itbus.common.controller;

/*
 *  
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.zhcx.platform.exception.BusinessException;

/**
 * Ext Base Action for all the request.
 * 
 * @author
 * 
 */
public class BaseController {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	public static final String SUCCESS = "success";

	public static final String INPUT = "input";

	public static final SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 应用程序的格式化符
	 */
	public static final String DATE_FORMAT_FULL = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 描述:获取 post请求内容
	 * 
	 * <pre>
	 * 举例：
	 * </pre>
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	public <T> T getRequestPostJavaBean(HttpServletRequest request, Class<T> clazz) throws BusinessException {
		StringBuffer buffer = new StringBuffer();
		InputStream inputstream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		try {
			inputstream = request.getInputStream();
			inputStreamReader = new InputStreamReader(inputstream, "UTF-8");
			bufferedReader = new BufferedReader(inputStreamReader);
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
		} catch (Exception e) {
			log.error("传入参数解析错误！", e);
			throw new BusinessException("传入参数解析错误:\n[" + buffer.toString() + "]");
		} finally {
			try {
				bufferedReader.close();
				inputStreamReader.close();
				bufferedReader.close();
			} catch (Exception e2) {
				log.error("关闭流失败！", e2);
			}
		}
		if (buffer.length() == 0)
			buffer.append("{}");

		return JSON.parseObject(buffer.toString(), clazz);
	}

	public <T> List<T> getRequestBeans(HttpServletRequest request, Class<T> clazz) throws BusinessException {
		StringBuffer buffer = new StringBuffer();
		InputStream inputstream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		try {
			inputstream = request.getInputStream();
			inputStreamReader = new InputStreamReader(inputstream, "UTF-8");
			bufferedReader = new BufferedReader(inputStreamReader);
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
		} catch (Exception e) {
			log.error("传入参数解析错误！", e);
			throw new BusinessException("传入参数解析错误:\n[" + buffer.toString() + "]");
		} finally {
			try {
				bufferedReader.close();
				inputStreamReader.close();
				bufferedReader.close();
			} catch (Exception e2) {
				log.error("关闭流失败！", e2);
			}
		}
		if (buffer.length() == 0)
			buffer.append("[{}]");

		return JSON.parseArray(buffer.toString(), clazz);
	}

	public <T> T getRequestBean(HttpServletRequest request, Class<T> clazz) throws BusinessException {
		StringBuffer buffer = new StringBuffer();
		InputStream inputstream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		try {
			inputstream = request.getInputStream();
			inputStreamReader = new InputStreamReader(inputstream, "UTF-8");
			bufferedReader = new BufferedReader(inputStreamReader);
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
		} catch (Exception e) {
			log.error("传入参数解析错误！", e);
			throw new BusinessException("传入参数解析错误:\n[" + buffer.toString() + "]");
		} finally {
			try {
				bufferedReader.close();
				inputStreamReader.close();
				bufferedReader.close();
			} catch (Exception e2) {
				log.error("关闭流失败！", e2);
			}
		}
		if (buffer.length() == 0)
			buffer.append("[{}]");

		return JSON.parseObject(buffer.toString(), clazz);
	}
}
