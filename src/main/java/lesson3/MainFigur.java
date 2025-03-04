package lesson3;



public class MainFigur {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red", "blue");
        Rectangle rectangle = new Rectangle(4, 6, "red", "blue");
        Triangle triangle = new Triangle(2, 3, 4, 5, "red", "blue");

        System.out.println("Площадь окружности: " + circle.calculateArea());
        System.out.println("Периметр окружности: " + circle.calculatePerimeter());
        System.out.println("Цвет фона окружности: " + circle.colorS());
        System.out.println("Цвет границ окружности: " + circle.colorP());

        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
        System.out.println("Цвет фона прямоугольника: " + rectangle.colorS());
        System.out.println("Цвет границ прямоугольника: " + rectangle.colorP());

        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
        System.out.println("Цвет фона треугольника: " + triangle.colorS());
        System.out.println("Цвет границ треугольника: " + triangle.colorP());


    }
}