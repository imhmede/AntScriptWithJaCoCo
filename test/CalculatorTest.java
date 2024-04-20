package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import src.Calculator;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        //assertTrue(true);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        //assertTrue(true);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.substract(3, 2));
        //assertTrue(true);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.divide(3, 2));
        //assertTrue(true);
    }
}
