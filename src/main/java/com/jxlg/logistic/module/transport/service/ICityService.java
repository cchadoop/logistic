package com.jxlg.logistic.module.transport.service;

import java.util.List;

import com.jxlg.logistic.module.transport.entity.City;
import com.jxlg.logistic.module.transport.entity.CityExample;
import com.jxlg.logistic.module.transport.queryview.CityQueryView;

public interface ICityService {

    int deleteByPrimaryKey(String cityId);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(String cityId);

    int updateByPrimaryKeySelective(City record);
    
    void deleteRows(String[] ids);

	List<CityQueryView> listView();

}
