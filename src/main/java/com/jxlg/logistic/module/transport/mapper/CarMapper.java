package com.jxlg.logistic.module.transport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxlg.logistic.module.transport.entity.Car;
import com.jxlg.logistic.module.transport.entity.CarExample;

public interface CarMapper {
    long countByExample(CarExample example);

    int deleteByExample(CarExample example);

    int deleteByPrimaryKey(String carId);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(String carId);

    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

}