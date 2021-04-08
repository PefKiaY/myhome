package com.home.cn.model;

import com.zhcx.itbus.common.BaseModel;

public class HomeHousingAtta extends BaseModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long uuid;

    private Long formId;

    private Short attaType;

    private String attaUrl;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public Short getAttaType() {
        return attaType;
    }

    public void setAttaType(Short attaType) {
        this.attaType = attaType;
    }

    public String getAttaUrl() {
        return attaUrl;
    }

    public void setAttaUrl(String attaUrl) {
        this.attaUrl = attaUrl == null ? null : attaUrl.trim();
    }
}