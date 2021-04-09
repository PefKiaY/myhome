package com.zhcx.commons.authority.bean.session;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2858373062421516807L;

	/**
	 * 账号ID tb_account_info
	 */
	private String accountId;

	/**
	 * 账号类型 tb_account_info
	 */
	private String accountType;

	/**
	 * 用户Id
	 */
	private String id;

	/**
	 * 登录账号 tb_account_info
	 */
	private String loginName;

	/**
	 * 企业ID 可以为空
	 */
	private String corpId;

	/**
	 * 企业名称
	 */
	private String corpName;

	/**
	 * 用户类型
	 */
	private String userType;

	/**
	 * 用户状态
	 */
	private String userStatus;

	/**
	 * 登录时间
	 */
	private Date loginDate;

	/**
	 * SessionId
	 */
	private String jid;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getJid() {
		return jid;
	}

	public void setJid(String jid) {
		this.jid = jid;
	}

}
