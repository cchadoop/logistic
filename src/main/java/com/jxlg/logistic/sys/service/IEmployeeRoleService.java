package com.jxlg.logistic.sys.service;

import java.util.List;

import com.jxlg.logistic.sys.entity.EmployeeRole;
import com.jxlg.logistic.sys.entity.EmployeeRoleExample;
import com.jxlg.logistic.sys.queryview.EmployeeRoleQueryView;

public interface IEmployeeRoleService {

    int deleteByPrimaryKey(String empRoleId);

    int insertSelective(EmployeeRole record);

    List<EmployeeRole> selectByExample(EmployeeRoleExample example);

    EmployeeRole selectByPrimaryKey(String empRoleId);

    int updateByPrimaryKeySelective(EmployeeRole record);

    void deleteRows(String[] ids);

	List<EmployeeRoleQueryView> listView();
}
