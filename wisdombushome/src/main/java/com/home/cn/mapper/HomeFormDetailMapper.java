package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.home.cn.model.HomeFormDetail;
import com.home.cn.model.HomeFormDetailExample;
import com.home.cn.param.HomeFormDetailParam;

public interface HomeFormDetailMapper {
    int countByExample(HomeFormDetailExample example);

    int deleteByExample(HomeFormDetailExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomeFormDetail record);

    int insertSelective(HomeFormDetail record);

    List<HomeFormDetail> selectByExampleWithBLOBs(HomeFormDetailExample example);

    List<HomeFormDetail> selectByExample(HomeFormDetailExample example);

    HomeFormDetail selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomeFormDetail record, @Param("example") HomeFormDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") HomeFormDetail record, @Param("example") HomeFormDetailExample example);

    int updateByExample(@Param("record") HomeFormDetail record, @Param("example") HomeFormDetailExample example);

    int updateByPrimaryKeySelective(HomeFormDetail record);

    int updateByPrimaryKeyWithBLOBs(HomeFormDetail record);

    int updateByPrimaryKey(HomeFormDetail record);
    
    List<HomeFormDetail> query(HomeFormDetailParam param, RowBounds rowBounds);
    
    List<HomeFormDetail> query(HomeFormDetailParam param);
    
    int count(HomeFormDetailParam param);
}