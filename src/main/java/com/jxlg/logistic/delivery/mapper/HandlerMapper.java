package com.jxlg.logistic.delivery.mapper;

import com.jxlg.logistic.delivery.entity.Handler;
import com.jxlg.logistic.delivery.entity.HandlerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HandlerMapper {
    long countByExample(HandlerExample example);

    int deleteByExample(HandlerExample example);

    int deleteByPrimaryKey(String handlerId);

    int insert(Handler record);

    int insertSelective(Handler record);

    List<Handler> selectByExample(HandlerExample example);

    Handler selectByPrimaryKey(String handlerId);

    int updateByExampleSelective(@Param("record") Handler record, @Param("example") HandlerExample example);

    int updateByExample(@Param("record") Handler record, @Param("example") HandlerExample example);

    int updateByPrimaryKeySelective(Handler record);

    int updateByPrimaryKey(Handler record);
}