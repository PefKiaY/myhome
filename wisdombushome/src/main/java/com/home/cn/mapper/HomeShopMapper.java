package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.home.cn.model.HomeShop;
import com.home.cn.model.HomeShopExample;
import com.home.cn.param.HomeShopParam;

public interface HomeShopMapper {
	
    int countByExample(HomeShopExample example);

    int deleteByExample(HomeShopExample example);

    int deleteByPrimaryKey(Long shopId);

    int insert(HomeShop record);

    int insertSelective(HomeShop record);

    List<HomeShop> selectByExample(HomeShopExample example);

    HomeShop selectByPrimaryKey(Long shopId);

    int updateByExampleSelective(@Param("record") HomeShop record, @Param("example") HomeShopExample example);

    int updateByExample(@Param("record") HomeShop record, @Param("example") HomeShopExample example);

    int updateByPrimaryKeySelective(HomeShop record);

    int updateByPrimaryKey(HomeShop record);
    
    List<HomeShop> query(HomeShopParam param, RowBounds rowBounds);
    
    List<HomeShop> query(HomeShopParam param);
    
    int count(HomeShopParam param);
}