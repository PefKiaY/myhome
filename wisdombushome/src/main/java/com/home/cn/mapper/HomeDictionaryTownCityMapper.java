package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.home.cn.model.HomeDictionaryTownCity;
import com.home.cn.model.HomeDictionaryTownCityExample;
import com.home.cn.param.HomeDictionaryTownCityParam;

public interface HomeDictionaryTownCityMapper {
    int countByExample(HomeDictionaryTownCityExample example);

    int deleteByExample(HomeDictionaryTownCityExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomeDictionaryTownCity record);

    int insertSelective(HomeDictionaryTownCity record);

    List<HomeDictionaryTownCity> selectByExample(HomeDictionaryTownCityExample example);

    HomeDictionaryTownCity selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomeDictionaryTownCity record, @Param("example") HomeDictionaryTownCityExample example);

    int updateByExample(@Param("record") HomeDictionaryTownCity record, @Param("example") HomeDictionaryTownCityExample example);

    int updateByPrimaryKeySelective(HomeDictionaryTownCity record);

    int updateByPrimaryKey(HomeDictionaryTownCity record);
    
    List<HomeDictionaryTownCity> query(HomeDictionaryTownCityParam param);
}