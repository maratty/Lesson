package lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import programms.Triangle;

@Test
public class TriangleTest {

    Triangle triangle = new Triangle();
    @Test
    public void testCalculateArea() {
        Assert.assertEquals(triangle.calculateArea(10, 5), 25.0, "Площадь треугольника с основанием 10 и высотой 5 должна быть 25.0");
        Assert.assertEquals(triangle.calculateArea(0, 5), 0.0, "Площадь треугольника с основанием 0 и высотой 5 должна быть 0.0");
        Assert.assertEquals(triangle.calculateArea(10, 0), 0.0, "Площадь треугольника с основанием 10 и высотой 0 должна быть 0.0");
        Assert.assertEquals(triangle.calculateArea(3, 4), 6.0, "Площадь треугольника с основанием 3 и высотой 4 должна быть 6.0");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateAreaWithNegativeBase() {
        triangle.calculateArea(-1, 5); // Ожидаем исключение
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateAreaWithNegativeHeight() {
        triangle.calculateArea(10, -5); // Ожидаем исключение
    }
}














































