package com.week3.employee.controller;

import com.week3.employee.model.Employee;
import com.week3.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@Valid @RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }
}