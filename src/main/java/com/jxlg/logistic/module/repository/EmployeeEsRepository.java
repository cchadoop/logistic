package com.jxlg.logistic.module.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.jxlg.logistic.module.sys.entity.Employee;

@Repository
public interface EmployeeEsRepository extends ElasticsearchRepository<Employee,String>{
	//JPA 与 mybatis 事务的管理不同，导致出错
}
