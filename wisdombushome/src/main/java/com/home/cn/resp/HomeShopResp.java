package com.home.cn.resp;

import java.util.Date;

public class HomeShopResp {
	
    private Long shopId;

    private String shopName;

    private String shopAddr;

    private String shopScope;

    private String shopLeader;

    private String shopLeaderPhone;

    private String shopContact;

    private String logo;

    private String shopRemark;

    private Date effectStartTime;

    private Date effectEndTime;

    private Long plotCode;

    private String plotName;

    private Long creator;

    private Date creatTime;

    private Long modifier;

    private Date modifyTime;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopAddr() {
        return shopAddr;
    }

    public void setShopAddr(String shopAddr) {
        this.shopAddr = shopAddr == null ? null : shopAddr.trim();
    }

    public String getShopScope() {
        return shopScope;
    }

    public void setShopScope(String shopScope) {
        this.shopScope = shopScope == null ? null : shopScope.trim();
    }

    public String getShopLeader() {
        return shopLeader;
    }

    public void setShopLeader(String shopLeader) {
        this.shopLeader = shopLeader == null ? null : shopLeader.trim();
    }

    public String getShopLeaderPhone() {
        return shopLeaderPhone;
    }

    public void setShopLeaderPhone(String shopLeaderPhone) {
        this.shopLeaderPhone = shopLeaderPhone == null ? null : shopLeaderPhone.trim();
    }

    public String getShopContact() {
        return shopContact;
    }

    public void setShopContact(String shopContact) {
        this.shopContact = shopContact == null ? null : shopContact.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getShopRemark() {
        return shopRemark;
    }

    public void setShopRemark(String shopRemark) {
        this.shopRemark = shopRemark == null ? null : shopRemark.trim();
    }

    public Date getEffectStartTime() {
        return effectStartTime;
    }

    public void setEffectStartTime(Date effectStartTime) {
        this.effectStartTime = effectStartTime;
    }

    public Date getEffectEndTime() {
        return effectEndTime;
    }

    public void setEffectEndTime(Date effectEndTime) {
        this.effectEndTime = effectEndTime;
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