package com.week2.junit;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup executed");
    }
    @AfterEach
    void tearDown() {
        System.out.println("Teardown executed");
    }
    @Test
    void testMultiply() {
        int a = 5;
        int b = 4;
        int result = calculator.multiply(a, b);
        assertEquals(20, result);
    }
}
