package lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import programms.Bolshe;


@Test
public class BolsheTest {
    // Создаем экземпляр класса
    Bolshe bolshe = new Bolshe();
@Test
    public boolean testisAGreaterThanB() {

    // Проверка a > b
    Assert.assertTrue(bolshe.isAGreaterThanB(5, 3), "5 должно быть больше 3");
    Assert.assertFalse(bolshe.isAGreaterThanB(2, 4), "2 не должно быть больше 4");
    return true;
}
@Test
    public boolean testisALessThanB() {
        // Проверка a < b
        Assert.assertTrue(bolshe.isALessThanB(2, 4), "2 должно быть меньше 4");
        Assert.assertFalse(bolshe.isALessThanB(5, 3), "5 не должно быть меньше 3");
    return true;
}
    public boolean testisAEqualToB() {
        // Проверка a == b
        Assert.assertTrue(bolshe.isAEqualToB(3, 3), "3 должно быть равно 3");
        Assert.assertFalse(bolshe.isAEqualToB(2, 3), "2 не должно быть равно 3");
        return true;
    }
}
