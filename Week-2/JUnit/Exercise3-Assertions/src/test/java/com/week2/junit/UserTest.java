package com.week2.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserTest {
    @Test
    void testAssertions() {
        User user = new User("Chirashree");
        assertEquals("Chirashree", user.getName());
        assertTrue(user.isValidAge(20));
        assertFalse(user.isValidAge(15));
        assertNotNull(user);
        User emptyUser = null;
        assertNull(emptyUser);
    }
}
