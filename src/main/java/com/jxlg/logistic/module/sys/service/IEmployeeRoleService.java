package com.jxlg.logistic.module.sys.service;

import java.util.List;

import com.jxlg.logistic.module.sys.entity.EmployeeRole;
import com.jxlg.logistic.module.sys.entity.EmployeeRoleExample;
import com.jxlg.logistic.module.sys.queryview.EmployeeRoleQueryView;

public interface IEmployeeRoleService {

    int deleteByPrimaryKey(String empRoleId);

    int insertSelective(EmployeeRole record);

    List<EmployeeRole> selectByExample(EmployeeRoleExample example);

    EmployeeRole selectByPrimaryKey(String empRoleId);

    int updateByPrimaryKeySelective(EmployeeRole record);

    void deleteRows(String[] ids);

	List<EmployeeRoleQueryView> listView();
}
