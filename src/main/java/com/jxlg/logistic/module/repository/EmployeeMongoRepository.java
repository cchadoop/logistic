package com.jxlg.logistic.module.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jxlg.logistic.module.sys.entity.Employee;

@Repository
public interface EmployeeMongoRepository extends MongoRepository<Employee, String>{

}
