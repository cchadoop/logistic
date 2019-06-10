package com.jxlg.logistic.order.mapper;

import com.jxlg.logistic.order.entity.Suppiler;
import com.jxlg.logistic.order.entity.SuppilerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuppilerMapper {
    long countByExample(SuppilerExample example);

    int deleteByExample(SuppilerExample example);

    int deleteByPrimaryKey(String suppilerId);

    int insert(Suppiler record);

    int insertSelective(Suppiler record);

    List<Suppiler> selectByExample(SuppilerExample example);

    Suppiler selectByPrimaryKey(String suppilerId);

    int updateByExampleSelective(@Param("record") Suppiler record, @Param("example") SuppilerExample example);

    int updateByExample(@Param("record") Suppiler record, @Param("example") SuppilerExample example);

    int updateByPrimaryKeySelective(Suppiler record);

    int updateByPrimaryKey(Suppiler record);
}