package Lesson_12_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programms.Calculate;

public class CalculateTest {


    Calculate calculate = new Calculate();

    @Test
    public void testAdd() {
        Assertions.assertEquals(5, calculate.add(2, 3), "2 + 3 должно быть равно 5");
        Assertions.assertEquals(-1, calculate.add(2, -3), "2 + (-3) должно быть равно -1");
        Assertions.assertEquals(0, calculate.add(0, 0), "0 + 0 должно быть равно 0");
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(-1, calculate.subtract(2, 3), "2 - 3 должно быть равно -1");
        Assertions.assertEquals(5, calculate.subtract(2, -3), "2 - (-3) должно быть равно 5");
        Assertions.assertEquals(0, calculate.subtract(0, 0), "0 - 0 должно быть равно 0");
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(6, calculate.multiply(2, 3), "2 * 3 должно быть равно 6");
        Assertions.assertEquals(-6, calculate.multiply(2, -3), "2 * (-3) должно быть равно -6");
        Assertions.assertEquals(0, calculate.multiply(0, 5), "0 * 5 должно быть равно 0");
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(2.0, calculate.divide(6, 3), "6 / 3 должно быть равно 2.0");
        Assertions.assertEquals(-2.0, calculate.divide(6, -3), "6 / (-3) должно быть равно -2.0");
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculate.divide(1, 0), "Деление на ноль должно выбросить исключение");
    }
}




