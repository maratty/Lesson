package Lesson_12_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programms.Bolshe;

public class BolsheTest {


    Bolshe bolshe = new Bolshe();

    @Test
    public void testaBolsheB() {
        Assertions.assertTrue(bolshe.aBolsheB(5, 3), "5 должно быть больше 3");
        Assertions.assertFalse(bolshe.aBolsheB(3, 5), "3 не должно быть больше 5");
    }

    @Test
    public void testbBolsheA() {
        Assertions.assertTrue(bolshe.bBolsheA(3, 5), "3 должно быть меньше 5");
        Assertions.assertFalse(bolshe.bBolsheA(5, 3), "5 должно быть меньше 3");
    }

    @Test
    public void testaRavnoB() {
        Assertions.assertTrue(bolshe.aRavnoB(5, 5), "5 должно быть равно 5");
        Assertions.assertFalse(bolshe.aRavnoB(5, 3), "5 не должно быть равно 3");
    }

}
