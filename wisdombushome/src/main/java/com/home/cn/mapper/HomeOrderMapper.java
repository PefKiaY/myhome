package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.home.cn.model.HomeOrder;
import com.home.cn.model.HomeOrderExample;
import com.home.cn.param.HomeOrderParam;

public interface HomeOrderMapper {
    int countByExample(HomeOrderExample example);

    int deleteByExample(HomeOrderExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomeOrder record);

    int insertSelective(HomeOrder record);

    List<HomeOrder> selectByExample(HomeOrderExample example);

    HomeOrder selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomeOrder record, @Param("example") HomeOrderExample example);

    int updateByExample(@Param("record") HomeOrder record, @Param("example") HomeOrderExample example);

    int updateByPrimaryKeySelective(HomeOrder record);

    int updateByPrimaryKey(HomeOrder record);
    
    List<HomeOrder> query(HomeOrderParam param, RowBounds rowBounds);
    
    List<HomeOrder> query(HomeOrderParam param);
    
    int count(HomeOrderParam param);
}