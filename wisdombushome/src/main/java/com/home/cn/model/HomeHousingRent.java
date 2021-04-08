package com.home.cn.model;

import java.util.Date;

import com.zhcx.itbus.common.BaseModel;

public class HomeHousingRent extends BaseModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long uuid;

    private Short rentType;

    private Short identityType;

    private Long plotCode;

    private String plotName;

    private String rentAddr;

    private Short room;

    private Short livingRoom;

    private Short toilet;

    private Short m2;

    private Short flow;

    private Short flowCount;

    private Short housingDirection;

    private Short housingD;

    private Short housingType;

    private String housingConfig;

    private Integer pay;

    private Integer payType;

    private String rentTitle;

    private String connector;

    private String phone;

    private Long corpId;

    private Date effEndTime;

    private Date effStartTime;

    private Long creator;

    private Date creatTime;

    private Long modifier;

    private Date modifyTime;

    private String rentRemark;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Short getRentType() {
        return rentType;
    }

    public void setRentType(Short rentType) {
        this.rentType = rentType;
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

    public String getRentAddr() {
        return rentAddr;
    }

    public void setRentAddr(String rentAddr) {
        this.rentAddr = rentAddr == null ? null : rentAddr.trim();
    }

    public Short getRoom() {
        return room;
    }

    public void setRoom(Short room) {
        this.room = room;
    }

    public Short getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(Short livingRoom) {
        this.livingRoom = livingRoom;
    }

    public Short getToilet() {
        return toilet;
    }

    public void setToilet(Short toilet) {
        this.toilet = toilet;
    }

    public Short getM2() {
        return m2;
    }

    public void setM2(Short m2) {
        this.m2 = m2;
    }

    public Short getFlow() {
        return flow;
    }

    public void setFlow(Short flow) {
        this.flow = flow;
    }

    public Short getFlowCount() {
        return flowCount;
    }

    public void setFlowCount(Short flowCount) {
        this.flowCount = flowCount;
    }

    public Short getHousingDirection() {
        return housingDirection;
    }

    public void setHousingDirection(Short housingDirection) {
        this.housingDirection = housingDirection;
    }

    public Short getHousingD() {
        return housingD;
    }

    public void setHousingD(Short housingD) {
        this.housingD = housingD;
    }

    public Short getHousingType() {
        return housingType;
    }

    public void setHousingType(Short housingType) {
        this.housingType = housingType;
    }

    public String getHousingConfig() {
        return housingConfig;
    }

    public void setHousingConfig(String housingConfig) {
        this.housingConfig = housingConfig == null ? null : housingConfig.trim();
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getRentTitle() {
        return rentTitle;
    }

    public void setRentTitle(String rentTitle) {
        this.rentTitle = rentTitle == null ? null : rentTitle.trim();
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

    public String getRentRemark() {
        return rentRemark;
    }

    public void setRentRemark(String rentRemark) {
        this.rentRemark = rentRemark == null ? null : rentRemark.trim();
    }
}