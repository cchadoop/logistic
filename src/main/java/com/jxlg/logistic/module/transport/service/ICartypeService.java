package com.jxlg.logistic.module.transport.service;

import java.util.List;

import com.jxlg.logistic.module.transport.entity.Cartype;
import com.jxlg.logistic.module.transport.entity.CartypeExample;

public interface ICartypeService {

    int deleteByPrimaryKey(String cartypeId);

    int insertSelective(Cartype record);

    List<Cartype> selectByExample(CartypeExample example);

    Cartype selectByPrimaryKey(String cartypeId);

    int updateByPrimaryKeySelective(Cartype record);
    
    void deleteRows(String[] ids);

}
