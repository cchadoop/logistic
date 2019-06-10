package com.jxlg.logistic.sys.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxlg.logistic.sys.entity.Power;
import com.jxlg.logistic.sys.entity.PowerExample;

public interface IPowerService {
	int deleteByPrimaryKey(String powerId);
	
	int insertSelective(Power record);
	
	List<Power> selectByExample(PowerExample example);

    Power selectByPrimaryKey(String powerId);
    
    int updateByPrimaryKeySelective(Power record);
    
    void deleteRows(String[] ids);

	List<Power> listView();

	List<Power> selectPowerById(@Param("empId")String empId);
}
