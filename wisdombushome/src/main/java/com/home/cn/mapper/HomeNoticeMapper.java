package com.home.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.home.cn.model.HomeNotice;
import com.home.cn.model.HomeNoticeExample;
import com.home.cn.param.HomeNoticeParam;

public interface HomeNoticeMapper {
    int countByExample(HomeNoticeExample example);

    int deleteByExample(HomeNoticeExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(HomeNotice record);

    int insertSelective(HomeNotice record);

    List<HomeNotice> selectByExample(HomeNoticeExample example);

    HomeNotice selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") HomeNotice record, @Param("example") HomeNoticeExample example);

    int updateByExample(@Param("record") HomeNotice record, @Param("example") HomeNoticeExample example);

    int updateByPrimaryKeySelective(HomeNotice record);

    int updateByPrimaryKey(HomeNotice record);
    
    List<HomeNotice> query(HomeNoticeParam param, RowBounds rowBounds);
    
    List<HomeNotice> query(HomeNoticeParam param);
    
    int count(HomeNoticeParam param);
}