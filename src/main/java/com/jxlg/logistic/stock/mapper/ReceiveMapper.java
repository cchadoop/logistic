package com.jxlg.logistic.stock.mapper;

import com.jxlg.logistic.stock.entity.Receive;
import com.jxlg.logistic.stock.entity.ReceiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiveMapper {
    long countByExample(ReceiveExample example);

    int deleteByExample(ReceiveExample example);

    int deleteByPrimaryKey(String receiveId);

    int insert(Receive record);

    int insertSelective(Receive record);

    List<Receive> selectByExample(ReceiveExample example);

    Receive selectByPrimaryKey(String receiveId);

    int updateByExampleSelective(@Param("record") Receive record, @Param("example") ReceiveExample example);

    int updateByExample(@Param("record") Receive record, @Param("example") ReceiveExample example);

    int updateByPrimaryKeySelective(Receive record);

    int updateByPrimaryKey(Receive record);
}