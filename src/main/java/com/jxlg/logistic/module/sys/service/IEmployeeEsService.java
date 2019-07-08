package com.jxlg.logistic.module.sys.service;

import java.util.List;

import com.jxlg.logistic.module.sys.entity.Employee;

public interface IEmployeeEsService {

	public void save(Employee employee);

	public void deleteById(String empId);

	public List<Employee> search(Integer pageNumber, Integer pageSize, String searchContent);

}
