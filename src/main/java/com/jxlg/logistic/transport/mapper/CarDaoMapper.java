package com.jxlg.logistic.transport.mapper;

import java.util.List;
import com.jxlg.logistic.transport.entity.Car;
import com.jxlg.logistic.transport.queryview.CarQueryView;

public interface CarDaoMapper {

	List<CarQueryView> listView(Car car);

}
