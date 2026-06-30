package com.week2.mockito;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
public class UserServiceTest {
    @Test
    void testArgumentMatching() {
        NotificationService mockService =
                mock(NotificationService.class);
        UserService userService =
                new UserService(mockService);
        userService.registerUser("Chirashree");
        verify(mockService).sendNotification(anyString());
    }
}