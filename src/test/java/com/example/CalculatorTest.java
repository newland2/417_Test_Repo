package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

  

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> calc.divide(1, 0)
        );
        assertEquals("Divisor cannot be zero", ex.getMessage());
    }
}
