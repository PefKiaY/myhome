package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.home.cn.model.HomeHousingRent;
import com.home.cn.model.HomeHousingRentExample;
import com.home.cn.param.HomeHousingRentParam;

public interface HomeHousingRentMapper {
    int countByExample(HomeHousingRentExample example);

    int deleteByExample(HomeHousingRentExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomeHousingRent record);

    int insertSelective(HomeHousingRent record);

    List<HomeHousingRent> selectByExampleWithBLOBs(HomeHousingRentExample example);

    List<HomeHousingRent> selectByExample(HomeHousingRentExample example);

    HomeHousingRent selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomeHousingRent record, @Param("example") HomeHousingRentExample example);

    int updateByExampleWithBLOBs(@Param("record") HomeHousingRent record, @Param("example") HomeHousingRentExample example);

    int updateByExample(@Param("record") HomeHousingRent record, @Param("example") HomeHousingRentExample example);

    int updateByPrimaryKeySelective(HomeHousingRent record);

    int updateByPrimaryKeyWithBLOBs(HomeHousingRent record);

    int updateByPrimaryKey(HomeHousingRent record);
    
    List<HomeHousingRent> query(HomeHousingRentParam param);
}