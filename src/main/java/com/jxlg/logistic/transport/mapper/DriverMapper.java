package com.jxlg.logistic.transport.mapper;

import com.jxlg.logistic.transport.entity.Driver;
import com.jxlg.logistic.transport.entity.DriverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DriverMapper {
    long countByExample(DriverExample example);

    int deleteByExample(DriverExample example);

    int deleteByPrimaryKey(String driverId);

    int insert(Driver record);

    int insertSelective(Driver record);

    List<Driver> selectByExample(DriverExample example);

    Driver selectByPrimaryKey(String driverId);

    int updateByExampleSelective(@Param("record") Driver record, @Param("example") DriverExample example);

    int updateByExample(@Param("record") Driver record, @Param("example") DriverExample example);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);
}