package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.home.cn.model.HomeDictionaryData;
import com.home.cn.model.HomeDictionaryDataExample;
import com.home.cn.param.HomeDictionaryDataParam;

public interface HomeDictionaryDataMapper {
	
    int countByExample(HomeDictionaryDataExample example);

    int deleteByExample(HomeDictionaryDataExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomeDictionaryData record);

    int insertSelective(HomeDictionaryData record);

    List<HomeDictionaryData> selectByExample(HomeDictionaryDataExample example);

    HomeDictionaryData selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomeDictionaryData record, @Param("example") HomeDictionaryDataExample example);

    int updateByExample(@Param("record") HomeDictionaryData record, @Param("example") HomeDictionaryDataExample example);

    int updateByPrimaryKeySelective(HomeDictionaryData record);

    int updateByPrimaryKey(HomeDictionaryData record);
    
    List<HomeDictionaryData> query(HomeDictionaryDataParam param);
}