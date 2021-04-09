/**  
* @Title:  BusinessException.java
* @Package com.dayhr.web.platform.exception
* @Description: TODO
* @author seff
* @date  2014-10-18 下午3:02:28
* @version 
*/
package com.zhcx.platform.exception;

/**
* Copyright dayhr2013-2014 All rights reserved
* @ClassName: BusinessException
* @Description: TODO
* @author seff
* @date 2014-10-18 下午3:02:28
*/
public class BusinessException extends Exception{

	/**
	* @Fields serialVersionUID : TODO
	*/
	private static final long serialVersionUID = 1136194152229310060L;

	/**
	 * 错误码
	 */
	protected String code = "Undefined";
	/**
	 * 错误信息
	 */
	protected String msg = "Undefined";

	public BusinessException() {
	}

	public BusinessException(String msg) {
		this.msg = msg;
	}

	public BusinessException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	/**
	* @return code
	*/
	public String getCode() {
		return code;
	}

	/**
	* @param code 要设置的 code
	*/
	public void setCode(String code) {
		this.code = code;
	}

	/**
	* @return msg
	*/
	public String getMsg() {
		return msg;
	}

	/**
	* @param msg 要设置的 msg
	*/
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
