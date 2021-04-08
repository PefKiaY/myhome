package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.home.cn.model.HomeHousingAtta;
import com.home.cn.model.HomeHousingAttaExample;
import com.home.cn.param.HomeHousingAttaParam;

public interface HomeHousingAttaMapper {
    int countByExample(HomeHousingAttaExample example);

    int deleteByExample(HomeHousingAttaExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomeHousingAtta record);

    int insertSelective(HomeHousingAtta record);

    List<HomeHousingAtta> selectByExample(HomeHousingAttaExample example);

    HomeHousingAtta selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomeHousingAtta record, @Param("example") HomeHousingAttaExample example);

    int updateByExample(@Param("record") HomeHousingAtta record, @Param("example") HomeHousingAttaExample example);

    int updateByPrimaryKeySelective(HomeHousingAtta record);

    int updateByPrimaryKey(HomeHousingAtta record);
    
    List<HomeHousingAtta> query(HomeHousingAttaParam param);
}