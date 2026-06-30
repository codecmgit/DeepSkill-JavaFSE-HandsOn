package com.week2.mockito;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
public class EmployeeServiceTest {
    @Test
    void testVoidMethod() {
        AuditService mockAudit =
                mock(AuditService.class);
        doNothing().when(mockAudit)
                   .logAction(anyString());
        EmployeeService service =
                new EmployeeService(mockAudit);
        service.addEmployee();
        verify(mockAudit)
                .logAction("Employee Added");
    }
}