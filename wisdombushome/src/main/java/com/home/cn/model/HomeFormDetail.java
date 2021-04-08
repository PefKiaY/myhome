package com.home.cn.model;

import java.util.Date;

import com.zhcx.itbus.common.BaseModel;

public class HomeFormDetail extends BaseModel{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long uuid;

    private Short identityType;

    private Long plotCode;

    private String plotName;

    private String addr;

    private Integer goodsUp;

    private Integer goodsMiddle;

    private Integer goodsLast;

    private String formTitle;

    private String connector;

    private String phone;

    private Long corpId;

    private Date effEndTime;

    private Date effStartTime;

    private Long creator;

    private Date creatTime;

    private Long modifier;

    private Date modifyTime;

    private String formRemark;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Short getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Short identityType) {
        this.identityType = identityType;
    }

    public Long getPlotCode() {
        return plotCode;
    }

    public void setPlotCode(Long plotCode) {
        this.plotCode = plotCode;
    }

    public String getPlotName() {
        return plotName;
    }

    public void setPlotName(String plotName) {
        this.plotName = plotName == null ? null : plotName.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Integer getGoodsUp() {
        return goodsUp;
    }

    public void setGoodsUp(Integer goodsUp) {
        this.goodsUp = goodsUp;
    }

    public Integer getGoodsMiddle() {
        return goodsMiddle;
    }

    public void setGoodsMiddle(Integer goodsMiddle) {
        this.goodsMiddle = goodsMiddle;
    }

    public Integer getGoodsLast() {
        return goodsLast;
    }

    public void setGoodsLast(Integer goodsLast) {
        this.goodsLast = goodsLast;
    }

    public String getFormTitle() {
        return formTitle;
    }

    public void setFormTitle(String formTitle) {
        this.formTitle = formTitle == null ? null : formTitle.trim();
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector == null ? null : connector.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    public Date getEffEndTime() {
        return effEndTime;
    }

    public void setEffEndTime(Date effEndTime) {
        this.effEndTime = effEndTime;
    }

    public Date getEffStartTime() {
        return effStartTime;
    }

    public void setEffStartTime(Date effStartTime) {
        this.effStartTime = effStartTime;
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

    public String getFormRemark() {
        return formRemark;
    }

    public void setFormRemark(String formRemark) {
        this.formRemark = formRemark == null ? null : formRemark.trim();
    }
}