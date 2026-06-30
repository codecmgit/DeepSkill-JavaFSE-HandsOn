package com.week2.mockito;
public class EmployeeService {
    private AuditService auditService;
    public EmployeeService(AuditService auditService) {
        this.auditService = auditService;
    }
    public void addEmployee() {
        auditService.logAction("Employee Added");
    }
}