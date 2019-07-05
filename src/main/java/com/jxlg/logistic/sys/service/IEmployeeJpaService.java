package com.jxlg.logistic.sys.service;

import java.util.List;

import com.jxlg.logistic.sys.entity.Employee;

public interface IEmployeeJpaService {

	public void save(Employee employee);

	public void deleteById(String empId);

	public List<Employee> search(Integer pageNumber, Integer pageSize, String searchContent);

}
