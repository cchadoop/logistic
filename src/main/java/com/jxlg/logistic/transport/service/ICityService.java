package com.jxlg.logistic.transport.service;

import java.util.List;

import com.jxlg.logistic.transport.entity.City;
import com.jxlg.logistic.transport.entity.CityExample;
import com.jxlg.logistic.transport.queryview.CityQueryView;

public interface ICityService {

    int deleteByPrimaryKey(String cityId);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(String cityId);

    int updateByPrimaryKeySelective(City record);
    
    void deleteRows(String[] ids);

	List<CityQueryView> listView();

}
