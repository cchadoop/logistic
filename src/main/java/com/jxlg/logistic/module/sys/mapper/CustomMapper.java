package com.jxlg.logistic.module.sys.mapper;

import com.jxlg.logistic.module.sys.entity.Custom;
import com.jxlg.logistic.module.sys.entity.CustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomMapper {
    long countByExample(CustomExample example);

    int deleteByExample(CustomExample example);

    int deleteByPrimaryKey(String cstId);

    int insert(Custom record);

    int insertSelective(Custom record);

    List<Custom> selectByExample(CustomExample example);

    Custom selectByPrimaryKey(String cstId);

    int updateByExampleSelective(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByExample(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);
}