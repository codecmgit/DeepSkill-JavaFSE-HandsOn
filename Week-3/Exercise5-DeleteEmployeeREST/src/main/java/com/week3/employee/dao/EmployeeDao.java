package com.week3.employee.dao;

import com.week3.employee.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmployeeDao {
    private static ArrayList<Employee> EMPLOYEE_LIST;
    @SuppressWarnings("unchecked")
    public EmployeeDao() {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        EMPLOYEE_LIST = (ArrayList<Employee>) context.getBean("employeeList");
    }
    public ArrayList<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
    public Employee updateEmployee(Employee employee) {
        for (int i = 0; i < EMPLOYEE_LIST.size(); i++) {
            if (EMPLOYEE_LIST.get(i).getEmployeeId().equals(employee.getEmployeeId())) {
                EMPLOYEE_LIST.set(i, employee);
                return employee;
            }
      }
        return null;
    }
    public Employee deleteEmployee(Integer employeeId) {
        for (int i = 0; i < EMPLOYEE_LIST.size(); i++) {
            if (EMPLOYEE_LIST.get(i).getEmployeeId().equals(employeeId)) {
                return EMPLOYEE_LIST.remove(i);
            }
       }
        return null;
    }
}