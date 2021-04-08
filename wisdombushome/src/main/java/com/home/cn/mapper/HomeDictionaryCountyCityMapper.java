package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.home.cn.model.HomeDictionaryCountyCity;
import com.home.cn.model.HomeDictionaryCountyCityExample;
import com.home.cn.param.HomeDictionaryCountyCityParam;

public interface HomeDictionaryCountyCityMapper {
    int countByExample(HomeDictionaryCountyCityExample example);

    int deleteByExample(HomeDictionaryCountyCityExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomeDictionaryCountyCity record);

    int insertSelective(HomeDictionaryCountyCity record);

    List<HomeDictionaryCountyCity> selectByExample(HomeDictionaryCountyCityExample example);

    HomeDictionaryCountyCity selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomeDictionaryCountyCity record, @Param("example") HomeDictionaryCountyCityExample example);

    int updateByExample(@Param("record") HomeDictionaryCountyCity record, @Param("example") HomeDictionaryCountyCityExample example);

    int updateByPrimaryKeySelective(HomeDictionaryCountyCity record);

    int updateByPrimaryKey(HomeDictionaryCountyCity record);
    
    List<HomeDictionaryCountyCity> query(HomeDictionaryCountyCityParam param);
}