package com.jxlg.logistic.module.sys.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxlg.logistic.module.sys.entity.Custom;
import com.jxlg.logistic.module.sys.entity.CustomExample;

public interface ICustomService {
	int deleteByPrimaryKey(String cstId);
	
	int insertSelective(Custom record);
	
	List<Custom> selectByExample(CustomExample example);

    Custom selectByPrimaryKey(String cstId);
    
    int updateByPrimaryKeySelective(Custom record);
    
    void deleteRows(String[] ids);
    
    List<Custom> listView(Custom custom);

	Custom checkCustom(@Param("code")String code);

	Custom selectByAccountAndPwd(@Param("account")String account, @Param("password")String password);
    
}
