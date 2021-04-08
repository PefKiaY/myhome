package com.home.cn.param;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HomeShopParam implements Serializable {

	private static final long serialVersionUID = -5586493092096977047L;
		
    public String getShopAddr() {
		return shopAddr;
	}

	public void setShopAddr(String shopAddr) {
		this.shopAddr = shopAddr;
	}

	public String getShopLeader() {
		return shopLeader;
	}

	public void setShopLeader(String shopLeader) {
		this.shopLeader = shopLeader;
	}

	public String getShopLeaderPhone() {
		return shopLeaderPhone;
	}

	public void setShopLeaderPhone(String shopLeaderPhone) {
		this.shopLeaderPhone = shopLeaderPhone;
	}

	public String getShopContact() {
		return shopContact;
	}

	public void setShopContact(String shopContact) {
		this.shopContact = shopContact;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getShopRemark() {
		return shopRemark;
	}

	public void setShopRemark(String shopRemark) {
		this.shopRemark = shopRemark;
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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creatTime;

    private Long modifier;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
		this.shopName = shopName;
	}

	public String getShopScope() {
		return shopScope;
	}

	public void setShopScope(String shopScope) {
		this.shopScope = shopScope;
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
		this.plotName = plotName;
	}

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}
    

}