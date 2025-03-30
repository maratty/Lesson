package lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import programms.Bolshe;


@Test
public class BolsheTest {
    // Создаем экземпляр класса
    Bolshe bolshe = new Bolshe();

    @Test
    public void testComparison() {
        // Проверка a > b
        Assert.assertTrue(bolshe.aBolsheB(5, 3), "5 должно быть больше 3");
        Assert.assertFalse(bolshe.aBolsheB(2, 4), "2 не должно быть больше 4");

        // Проверка a < b
        Assert.assertTrue(bolshe.bBolsheA(2, 4), "2 должно быть меньше 4");
        Assert.assertFalse(bolshe.bBolsheA(5, 3), "5 не должно быть меньше 3");

        // Проверка a == b
        Assert.assertTrue(bolshe.aRavnoB(3, 3), "3 должно быть равно 3");
        Assert.assertFalse(bolshe.aRavnoB(2, 3), "2 не должно быть равно 3");
    }
}

