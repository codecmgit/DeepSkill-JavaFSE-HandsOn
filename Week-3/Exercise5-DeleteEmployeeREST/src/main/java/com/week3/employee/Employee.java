package com.week3.employee.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Employee {
    @NotNull(message = "Employee ID cannot be null")
    private Integer employeeId;
    @NotBlank(message = "Employee Name cannot be empty")
    @Size(min = 2, max = 30, message = "Employee Name must contain 2 to 30 characters")
    private String employeeName;
    @NotNull(message = "Department cannot be null")
    private Department department;
    private List<String> skills;
    public Employee() {
    }
    public Employee(Integer employeeId, String employeeName,
                    Department department, List<String> skills) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.skills = skills;
    }
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public List<String> getSkills() {
        return skills;
    }
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}