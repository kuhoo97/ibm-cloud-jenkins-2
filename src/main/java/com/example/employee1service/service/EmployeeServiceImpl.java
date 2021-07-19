package com.example.employee1service.service;


import com.example.employee1service.dao.EmployeeDao;
import com.example.employee1service.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;


    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {

        this.employeeDao = employeeDao;
    }

    @Override
    public Employee createEmployee(Employee employee) {

        return employeeDao.save(employee);
    }

    @Override
    public List<Employee> displayEmployee() {
        return employeeDao.findAll();
    }
}
