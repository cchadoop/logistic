package com.jxlg.logistic.module.sys.mapper;

import com.jxlg.logistic.module.sys.entity.Power;
import com.jxlg.logistic.module.sys.entity.PowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerMapper {
    long countByExample(PowerExample example);

    int deleteByExample(PowerExample example);

    int deleteByPrimaryKey(String powerId);

    int insert(Power record);

    int insertSelective(Power record);

    List<Power> selectByExample(PowerExample example);

    Power selectByPrimaryKey(String powerId);

    int updateByExampleSelective(@Param("record") Power record, @Param("example") PowerExample example);

    int updateByExample(@Param("record") Power record, @Param("example") PowerExample example);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);
}