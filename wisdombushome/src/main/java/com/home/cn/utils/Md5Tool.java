package com.home.cn.utils;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

/**
 * @ClassName：Md5Tool
 * @Description: MD5加密工具类
 * @author：肖春平
 * @date：2014-4-17 下午1:45:25 
 * @version
 */
@SuppressWarnings("restriction")
public class Md5Tool {
	
	/**
	 * @Title: getMd5 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param password
	 * @return
	 * @return String
	 * @throws
	 */
	public static String getMd5(String password){
		String str = "";
		if(password !=null && !password.equals("")){
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				
				BASE64Encoder base = new BASE64Encoder();
				//加密后的字符串
				str = base.encode(md.digest(password.getBytes("utf-8")));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return str;
	}
	
	/**
	 * @Title: matchingPass 
	 * @Description: 匹配页面输入的密码和数据库md5密码是否一样 
	 * @param pass
	 * @param passdb
	 * @return
	 * @return boolean
	 * @throws
	 */
	public static boolean matchingPass(String pass ,String passdb){
		boolean flag = false;
		if(getMd5(pass).equals(passdb)){
			flag = true;
		}
		return flag;
	}

}
