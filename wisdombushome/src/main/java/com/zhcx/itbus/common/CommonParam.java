package com.zhcx.itbus.common;


import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.zhcx.platform.pagination.PageBean;

public class CommonParam implements Serializable
{
    private static final long serialVersionUID = -825803931534033427L;

    private Long uuid;
    
    /**
     * 修改人
     */
    private Long modifier;

    /**
     * 有效开始时间
     */
    private Date effStartTime;

    /**
     * 有效结束时间
     */
    private Date effEndTime;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    private String orderBy = "timeModified";

    private String sortType = "ASC";

    private PageBean pageBean = new PageBean();

    public Long getUuid()
    {
        return uuid;
    }

    public void setUuid(Long uuid)
    {
        this.uuid = uuid;
    }

    public String getOrderBy()
    {
        return orderBy;
    }

    public void setOrderBy(String orderBy)
    {
        this.orderBy = orderBy;
    }

    public String getSortType()
    {
        return sortType;
    }

    public void setSortType(String sortType)
    {
        this.sortType = sortType;
    }

    public PageBean getPageBean()
    {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean)
    {
        this.pageBean = pageBean;
    }

    public List<String> getList(String commaStr)
    {
        if (commaStr.contains(","))
        {
            return Arrays.asList(commaStr.split(","));
        }
        else
        {
            return Arrays.asList(new String[]
            { commaStr });
        }
    }

	public Long getModifier() {
		return modifier;
	}

	public void setModifier(Long modifier) {
		this.modifier = modifier;
	}

	public Date getEffStartTime() {
		return effStartTime;
	}

	public void setEffStartTime(Date effStartTime) {
		this.effStartTime = effStartTime;
	}

	public Date getEffEndTime() {
		return effEndTime;
	}

	public void setEffEndTime(Date effEndTime) {
		this.effEndTime = effEndTime;
	}

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}
