package com.home.cn.model;

import java.util.Date;

import com.zhcx.itbus.common.BaseModel;

public class HomeDictionaryProvinceCity extends BaseModel{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long uuid;

    private String code;

    private String name;

    private Date effStartTime;

    private Date effEndTime;

    private Long corpId;

    private Long creator;

    private Date creatTime;

    private Long modifier;

    private Date modifyTime;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
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