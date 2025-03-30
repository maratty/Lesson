package lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import programms.Calculate;


@Test
public class CalculateTest {
    // Создаем экземпляр класса
    Calculate calculate = new Calculate();

    @Test
    public void testAdd() {
        Assert.assertEquals(calculate.add(2, 3), 5, "2 + 3 должно быть равно 5");
        Assert.assertEquals(calculate.add(-1, 1), 0, "-1 + 1 должно быть равно 0");
        Assert.assertEquals(calculate.add(-1, -1), -2, "-1 + -1 должно быть равно -2");
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculate.subtract(5, 3), 2, "5 - 3 должно быть равно 2");
        Assert.assertEquals(calculate.subtract(0, 1), -1, "0 - 1 должно быть равно -1");
        Assert.assertEquals(calculate.subtract(-1, -1), 0, "-1 - -1 должно быть равно 0");
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calculate.multiply(2, 3), 6, "2 * 3 должно быть равно 6");
        Assert.assertEquals(calculate.multiply(-1, 1), -1, "-1 * 1 должно быть равно -1");
        Assert.assertEquals(calculate.multiply(0, 5), 0, "0 * 5 должно быть равно 0");
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calculate.divide(6, 3), 2, "6 / 3 должно быть равно 2");
        Assert.assertEquals(calculate.divide(-6, 3), -2, "-6 / 3 должно быть равно -2");
        Assert.assertEquals(calculate.divide(0, 1), 0, "0 / 1 должно быть равно 0");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculate.divide(1, 0); // Ожидаем исключение
    }
}
