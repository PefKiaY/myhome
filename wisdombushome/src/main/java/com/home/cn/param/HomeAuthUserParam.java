package com.home.cn.param;

import java.io.Serializable;

public class HomeAuthUserParam implements Serializable {

	private static final long serialVersionUID = -5586493092096977047L;

    private Long uuid;

    private String loginName;

    private String userName;

    private String password;
    
    private String newPassword;

    public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	private String saltDensityValue;

    private Long plotCode;

    private String plotName;

    private String shopId;

    private Short userType;

    private String email;

    private String mobilePhone;

    private Short userStatus;

    private String dateFrom;

    private String dateTo;

    private String activedate;

    private String enddate;

    private Long creator;

    private String timeCreated;

    private Long whoModified;

    private String timeModified;

    private String channel;

    private String source;

    private String userImg;

    private String userExt2;

    private String userExt3;

    private String userExt4;

    public String getSaltDensityValue() {
		return saltDensityValue;
	}

	public void setSaltDensityValue(String saltDensityValue) {
		this.saltDensityValue = saltDensityValue;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getActivedate() {
		return activedate;
	}

	public void setActivedate(String activedate) {
		this.activedate = activedate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(String timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Long getWhoModified() {
		return whoModified;
	}

	public void setWhoModified(Long whoModified) {
		this.whoModified = whoModified;
	}

	public String getTimeModified() {
		return timeModified;
	}

	public void setTimeModified(String timeModified) {
		this.timeModified = timeModified;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getUserExt2() {
		return userExt2;
	}

	public void setUserExt2(String userExt2) {
		this.userExt2 = userExt2;
	}

	public String getUserExt3() {
		return userExt3;
	}

	public void setUserExt3(String userExt3) {
		this.userExt3 = userExt3;
	}

	public String getUserExt4() {
		return userExt4;
	}

	public void setUserExt4(String userExt4) {
		this.userExt4 = userExt4;
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

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Short getUserType() {
		return userType;
	}

	public void setUserType(Short userType) {
		this.userType = userType;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Short getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Short userStatus) {
		this.userStatus = userStatus;
	}

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }
}