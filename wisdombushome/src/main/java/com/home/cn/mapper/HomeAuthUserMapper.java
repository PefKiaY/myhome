package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.home.cn.model.HomeAuthUser;
import com.home.cn.model.HomeAuthUserExample;
import com.home.cn.param.HomeAuthUserParam;

public interface HomeAuthUserMapper {
	
    int countByExample(HomeAuthUserExample example);

    int deleteByExample(HomeAuthUserExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomeAuthUser record);

    int insertSelective(HomeAuthUser record);

    List<HomeAuthUser> selectByExample(HomeAuthUserExample example);

    HomeAuthUser selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomeAuthUser record, @Param("example") HomeAuthUserExample example);

    int updateByExample(@Param("record") HomeAuthUser record, @Param("example") HomeAuthUserExample example);

    int updateByPrimaryKeySelective(HomeAuthUser record);

    int updateByPrimaryKey(HomeAuthUser record);
    
    List<HomeAuthUser> query(HomeAuthUserParam param);
}