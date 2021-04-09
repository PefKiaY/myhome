package com.zhcx.itbus.common;

import java.io.Serializable;

import com.zhcx.platform.pagination.PageBean;

public class ReturnObject<T> implements Serializable
{
    private static final long serialVersionUID = 5712176130179394042L;

    private T data;

    // 操作结果
    private String result = Boolean.TRUE.toString();

    // 结果描述
    private String resultDesc = "操作成功";

    // 状态码
    private String statusCode = "0";

    private PageBean pageBean = PageBean.DEFAULT;

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public String getResult()
    {
        return result;
    }

    public void setResult(String result)
    {
        this.result = result;
    }

    public String getResultDesc()
    {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc)
    {
        this.resultDesc = resultDesc;
    }

    public String getStatusCode()
    {
        return statusCode;
    }

    public void setStatusCode(String statusCode)
    {
        this.statusCode = statusCode;
    }

    public PageBean getPageBean()
    {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean)
    {
        this.pageBean = pageBean;
    }
    
    public static <T> ReturnObject<T> getErrorObject(String statusCode, String resultDesc) {
    	ReturnObject<T> ro = new ReturnObject<T>();
    	ro.setResult("false");
    	ro.setStatusCode(statusCode);
    	ro.setResultDesc(resultDesc);
    	return ro;
    }
}
