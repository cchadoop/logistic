package com.jxlg.logistic.transport.service;

import java.util.List;

import com.jxlg.logistic.transport.entity.Driver;
import com.jxlg.logistic.transport.entity.DriverExample;

public interface IDriverService {

    int deleteByPrimaryKey(String driverId);

    int insertSelective(Driver record);

    List<Driver> selectByExample(DriverExample example);

    Driver selectByPrimaryKey(String driverId);

    int updateByPrimaryKeySelective(Driver record);
    
    void deleteRows(String[] ids);

	List<Driver> listView(Driver driver);

}
