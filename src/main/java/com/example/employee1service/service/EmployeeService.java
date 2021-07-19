package com.example.employee1service.service;

import com.example.employee1service.model.Employee;


import java.util.List;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);

    public List<Employee> displayEmployee();
}
