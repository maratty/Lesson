package Lesson_12_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programms.Factorial;

public class FactorialTest {

    Factorial factorial = new Factorial();

    @Test
    public void testCalculate() {
        Assertions.assertEquals(1, factorial.calculate(0), "Факториал 0 должен быть 1");
        Assertions.assertEquals(1, factorial.calculate(1), "Факториал 1 должен быть 1");
        Assertions.assertEquals(2, factorial.calculate(2), "Факториал 2 должен быть 2");
        Assertions.assertEquals(6, factorial.calculate(3), "Факториал 3 должен быть 6");
        Assertions.assertEquals(24, factorial.calculate(4), "Факториал 4 должен быть 24");
        Assertions.assertEquals(120, factorial.calculate(5), "Факториал 5 должен быть 120");
        Assertions.assertEquals(720, factorial.calculate(6), "Факториал 6 должен быть 720");
    }

    @Test
    public void testCalculateNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.calculate(-1), "Факториал не должен быть определен для отрицательных чисел");
    }
}
