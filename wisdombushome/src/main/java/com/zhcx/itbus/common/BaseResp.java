package com.zhcx.itbus.common;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BaseResp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long uuid;

	private String corpName;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date effStartTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date effEndTime;

	private Long creatorName;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	private Long modifierName;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date modifyTime;

	public Long getUuid() {
		return uuid;
	}

	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public Date getEffStartTime() {
		return effStartTime;
	}

	public void setEffStartTime(Date effStartTime) {
		this.effStartTime = effStartTime;
	}

	public Date getEffEndTime() {
		return effEndTime;
	}

	public void setEffEndTime(Date effEndTime) {
		this.effEndTime = effEndTime;
	}

	public Long getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(Long creatorName) {
		this.creatorName = creatorName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getModifierName() {
		return modifierName;
	}

	public void setModifierName(Long modifierName) {
		this.modifierName = modifierName;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
