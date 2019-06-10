package com.jxlg.logistic.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxlg.logistic.sys.entity.Power;

public interface PowerDaoMapper {
	List<Power> listView();

	List<Power> selectPowerById(@Param("empId")String empId);
}
