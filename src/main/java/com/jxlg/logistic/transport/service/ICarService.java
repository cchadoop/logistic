package com.jxlg.logistic.transport.service;

import java.util.List;
import com.jxlg.logistic.transport.entity.Car;
import com.jxlg.logistic.transport.entity.CarExample;
import com.jxlg.logistic.transport.queryview.CarQueryView;

public interface ICarService {

    int deleteByPrimaryKey(String carId);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(String carId);

    int updateByPrimaryKeySelective(Car record);
    
    void deleteRows(String[] ids);

	List<CarQueryView> listView(Car car);

}
