package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.home.cn.model.HomeJob;
import com.home.cn.model.HomeJobExample;
import com.home.cn.param.HomeJobParam;

public interface HomeJobMapper {
    int countByExample(HomeJobExample example);

    int deleteByExample(HomeJobExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomeJob record);

    int insertSelective(HomeJob record);

    List<HomeJob> selectByExample(HomeJobExample example);

    HomeJob selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomeJob record, @Param("example") HomeJobExample example);

    int updateByExample(@Param("record") HomeJob record, @Param("example") HomeJobExample example);

    int updateByPrimaryKeySelective(HomeJob record);

    int updateByPrimaryKey(HomeJob record);
    
    List<HomeJob> query(HomeJobParam param);
}