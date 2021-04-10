package com.zhcx.itbus.common;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long uuid;

	private Long corpId;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date effStartTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date effEndTime;

	private Long creator;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	private Long modifier;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date modifyTime;

	public Long getUuid() {
		return uuid;
	}

	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	public Long getCorpId() {
		return corpId;
	}

	public void setCorpId(Long corpId) {
		this.corpId = corpId;
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

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getModifier() {
		return modifier;
	}

	public void setModifier(Long modifier) {
		this.modifier = modifier;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
