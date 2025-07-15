package com.example.springbootfirst.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    com.example.springbootems.utils.Calculator calc = new com.example.springbootems.utils.Calculator();

    @Test
    void testAddition() {
        assertEquals(7, calc.add(4, 3));
        assertEquals(-1, calc.add(2, -3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calc.subtract(4, 3));
        assertEquals(5, calc.subtract(2, -3));
    }

    @Test
    void testMultiplication() {
        assertEquals(12, calc.multiply(4, 3));
        assertEquals(0, calc.multiply(0, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calc.divide(6, 3));
        assertEquals(2.5, calc.divide(5, 2));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
