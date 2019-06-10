package com.jxlg.logistic.transport.service;

import java.util.List;

import com.jxlg.logistic.transport.entity.Province;
import com.jxlg.logistic.transport.entity.ProvinceExample;

public interface IProvinceService {

    int deleteByPrimaryKey(String provinceId);

    int insertSelective(Province record);

    List<Province> selectByExample(ProvinceExample example);

    Province selectByPrimaryKey(String provinceId);

    int updateByPrimaryKeySelective(Province record);
    
    void deleteRows(String[] ids);

}
