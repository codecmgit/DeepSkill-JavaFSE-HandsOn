package com.week3.employee.model;

import java.util.List;

public class Employee {

    private int employeeId;
    private String employeeName;
    private Department department;
    private List<Skill> skills;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName,
                    Department department, List<Skill> skills) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.skills = skills;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
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
    public List<Skill> getSkills() {
        return skills;
    }
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}