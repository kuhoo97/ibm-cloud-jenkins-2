package com.example.employee1service.dao;

import com.example.employee1service.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends MongoRepository<Employee, Integer> {

}
