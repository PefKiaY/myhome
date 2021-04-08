package com.home.cn.param;

import java.io.Serializable;

public class HomeDictionaryDataParam implements Serializable {

	private static final long serialVersionUID = -5586493092096977047L;
	
    private Long uuid;

    private String code;

    private String type;

    private String superCode;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSuperCode() {
        return superCode;
    }

    public void setSuperCode(String superCode) {
        this.superCode = superCode == null ? null : superCode.trim();
    }

}