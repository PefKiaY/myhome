package com.home.cn.resp;

import java.io.Serializable;

public class HomeAuthUserResp implements Serializable {

	private static final long serialVersionUID = -5586493092096977047L;

    private String uuid;

    private String loginName;

    private String userName;

    private String password;

    private String saltDensityValue;

    private String corpId;

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
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

    public String getSaltDensityValue() {
        return saltDensityValue;
    }

    public void setSaltDensityValue(String saltDensityValue) {
        this.saltDensityValue = saltDensityValue == null ? null : saltDensityValue.trim();
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public Short getUserType() {
        return userType;
    }

    public void setUserType(Short userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public Short getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Short userStatus) {
        this.userStatus = userStatus;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom == null ? null : dateFrom.trim();
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo == null ? null : dateTo.trim();
    }

    public String getActivedate() {
        return activedate;
    }

    public void setActivedate(String activedate) {
        this.activedate = activedate == null ? null : activedate.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated == null ? null : timeCreated.trim();
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
        this.timeModified = timeModified == null ? null : timeModified.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public String getUserExt2() {
        return userExt2;
    }

    public void setUserExt2(String userExt2) {
        this.userExt2 = userExt2 == null ? null : userExt2.trim();
    }

    public String getUserExt3() {
        return userExt3;
    }

    public void setUserExt3(String userExt3) {
        this.userExt3 = userExt3 == null ? null : userExt3.trim();
    }

    public String getUserExt4() {
        return userExt4;
    }

    public void setUserExt4(String userExt4) {
        this.userExt4 = userExt4 == null ? null : userExt4.trim();
    }
}