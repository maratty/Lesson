package Lesson_12_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programms.Triangle;

public class TriangleTest {


    Triangle triangle = new Triangle();

    @Test
    public void testCalculateArea() {
        Assertions.assertEquals(6.0, triangle.calculateArea(4, 3), 0.0001, "Площадь треугольника с основанием 4 и высотой 3 должна быть 6.0");
        Assertions.assertEquals(10.0, triangle.calculateArea(5, 4), 0.0001, "Площадь треугольника с основанием 5 и высотой 4 должна быть 10.0");
        Assertions.assertEquals(0.5, triangle.calculateArea(1, 1), 0.0001, "Площадь треугольника с основанием 1 и высотой 1 должна быть 0.5");
    }

    @Test
    public void testCalculateAreaInvalidDimensions() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> triangle.calculateArea(-1, 2), "Основание и высота должны быть положительными.");
        Assertions.assertThrows(IllegalArgumentException.class, () -> triangle.calculateArea(2, -1), "Основание и высота должны быть положительными.");
        Assertions.assertThrows(IllegalArgumentException.class, () -> triangle.calculateArea(0, 1), "Основание и высота должны быть положительными.");
        Assertions.assertThrows(IllegalArgumentException.class, () -> triangle.calculateArea(1, 0), "Основание и высота должны быть положительными.");
    }
}
















































