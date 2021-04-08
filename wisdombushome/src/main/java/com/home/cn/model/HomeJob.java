package com.home.cn.model;

import java.util.Date;

import com.zhcx.itbus.common.BaseModel;

public class HomeJob extends BaseModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long uuid;

    private String province;

    private String town;

    private String county;

    private String addr;

    private String jobKey;

    private String jobTitle;

    private String salaryUnit;

    private Integer salary;

    private String jobRemark;

    private String aboutUs;

    private String connector;

    private String phone;

    private Date effEndTime;

    private Date effStartTime;

    private Long plotCode;

    private String plotName;

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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town == null ? null : town.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getJobKey() {
        return jobKey;
    }

    public void setJobKey(String jobKey) {
        this.jobKey = jobKey == null ? null : jobKey.trim();
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle == null ? null : jobTitle.trim();
    }

    public String getSalaryUnit() {
        return salaryUnit;
    }

    public void setSalaryUnit(String salaryUnit) {
        this.salaryUnit = salaryUnit == null ? null : salaryUnit.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getJobRemark() {
        return jobRemark;
    }

    public void setJobRemark(String jobRemark) {
        this.jobRemark = jobRemark == null ? null : jobRemark.trim();
    }

    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs == null ? null : aboutUs.trim();
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