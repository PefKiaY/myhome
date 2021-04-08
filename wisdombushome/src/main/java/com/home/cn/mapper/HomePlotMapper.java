package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.home.cn.model.HomePlot;
import com.home.cn.model.HomePlotExample;
import com.home.cn.param.HomePlotParam;

public interface HomePlotMapper {
    int countByExample(HomePlotExample example);

    int deleteByExample(HomePlotExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomePlot record);

    int insertSelective(HomePlot record);

    List<HomePlot> selectByExample(HomePlotExample example);

    HomePlot selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomePlot record, @Param("example") HomePlotExample example);

    int updateByExample(@Param("record") HomePlot record, @Param("example") HomePlotExample example);

    int updateByPrimaryKeySelective(HomePlot record);

    int updateByPrimaryKey(HomePlot record);
    
    List<HomePlot> query(HomePlotParam param);
}