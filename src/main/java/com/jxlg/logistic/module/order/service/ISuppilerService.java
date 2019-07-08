package com.jxlg.logistic.module.order.service;

import java.util.List;

import com.jxlg.logistic.module.order.entity.Suppiler;
import com.jxlg.logistic.module.order.entity.SuppilerExample;

public interface ISuppilerService {

    int deleteByPrimaryKey(String suppilerId);

    int insertSelective(Suppiler record);

    List<Suppiler> selectByExample(SuppilerExample example);

    Suppiler selectByPrimaryKey(String suppilerId);

    int updateByPrimaryKeySelective(Suppiler record);
    
    void deleteRows(String[] ids);

	List<Suppiler> listView(Suppiler suppiler);

}
