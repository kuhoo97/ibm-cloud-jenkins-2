package com.example.employee1service.controller;


import com.example.employee1service.model.Employee;
import com.example.employee1service.service.EmployeeService;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;
    private Environment environment;

    @GetMapping
    public ResponseEntity<StringBuilder> getStatus()
    {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("application employee-service is up");
        stringBuilder.append("on port: "+environment.getProperty("local.server.port"));
        return ResponseEntity.ok(stringBuilder);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
    {
        return new ResponseEntity<Employee>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees()
    {
        return ResponseEntity.ok(employeeService.displayEmployee());

    }



}
