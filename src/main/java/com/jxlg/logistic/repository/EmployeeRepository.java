package com.jxlg.logistic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.jxlg.logistic.sys.entity.Employee;

@Repository
public interface EmployeeRepository extends ElasticsearchRepository<Employee,String>{
	//JPA 与 mybatis 事务的管理不同，导致出错
}
