package com.jxlg.logistic.module.transport.mapper;

import java.util.List;
import com.jxlg.logistic.module.transport.entity.Car;
import com.jxlg.logistic.module.transport.queryview.CarQueryView;

public interface CarDaoMapper {

	List<CarQueryView> listView(Car car);

}
