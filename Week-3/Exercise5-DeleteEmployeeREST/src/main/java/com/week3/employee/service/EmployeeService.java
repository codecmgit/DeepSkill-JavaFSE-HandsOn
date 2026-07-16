package com.week3.employee.service;

import com.week3.employee.dao.EmployeeDao;
import com.week3.employee.exception.EmployeeNotFoundException;
import com.week3.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.week3.employee.exception.EmployeeNotFoundException;

import java.util.ArrayList;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Transactional
    public ArrayList<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
    @Transactional
    public Employee updateEmployee(Employee employee) {
    Employee updated = employeeDao.updateEmployee(employee);
    if (updated == null) {
        throw new EmployeeNotFoundException("Employee with ID " + employee.getEmployeeId() + " not found");
    }
    return updated;
    }
    @Transactional
    public Employee deleteEmployee(Integer employeeId) {
    Employee employee = employeeDao.deleteEmployee(employeeId);
    if (employee == null) {
        throw new EmployeeNotFoundException("Employee with ID " + employeeId + " not found");
    }
    return employee;
    }
}