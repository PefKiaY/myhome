package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.home.cn.model.HomeDictionaryProvinceCity;
import com.home.cn.model.HomeDictionaryProvinceCityExample;
import com.home.cn.param.HomeDictionaryProvinceCityParam;

public interface HomeDictionaryProvinceCityMapper {
    int countByExample(HomeDictionaryProvinceCityExample example);

    int deleteByExample(HomeDictionaryProvinceCityExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomeDictionaryProvinceCity record);

    int insertSelective(HomeDictionaryProvinceCity record);

    List<HomeDictionaryProvinceCity> selectByExample(HomeDictionaryProvinceCityExample example);

    HomeDictionaryProvinceCity selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomeDictionaryProvinceCity record, @Param("example") HomeDictionaryProvinceCityExample example);

    int updateByExample(@Param("record") HomeDictionaryProvinceCity record, @Param("example") HomeDictionaryProvinceCityExample example);

    int updateByPrimaryKeySelective(HomeDictionaryProvinceCity record);

    int updateByPrimaryKey(HomeDictionaryProvinceCity record);
    
    List<HomeDictionaryProvinceCity> query(HomeDictionaryProvinceCityParam param);
}