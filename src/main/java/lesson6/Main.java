package lesson6;

public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat("Кот Barsik");
        Cat batmen = new Cat("Кот Батмен");
        Dog flash = new Dog("Собака Флэш");
        Dog black = new Dog("Собака Черныш");

        barsik.run(200);
        barsik.swim(10);
        batmen.run(250);
        batmen.swim(5);
        flash.run(400);
        flash.swim(5);
        black.run(600);
        black.swim(15);

        barsik.may(5);
        batmen.may(15);

        System.out.println("Общее колиество животных: " + Animal.getCountAnimal());
        System.out.println("Общее количество котов: " + Cat.getCountCat());
        System.out.println("Общее количество собак: " + Dog.getCountDod());
        System.out.println(" ");

        Circle circle = new Circle(5, "red", "blue");
        Rectangle rectangle = new Rectangle(4, 6, "red", "blue");
        Triangle triangle = new Triangle(2, 3, 4, 5, "red", "blue");

        System.out.println("Площадь окружности: " + circle.calculateArea());
        System.out.println("Периметр окружности: " + circle.calculatePerimeter());
        System.out.println("Цвет фона окружности: " + circle.colorS());
        System.out.println("Цвет границ окружности: " + circle.colorP());
        System.out.println(" ");

        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
        System.out.println("Цвет фона прямоугольника: " + rectangle.colorS());
        System.out.println("Цвет границ прямоугольника: " + rectangle.colorP());
        System.out.println(" ");

        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
        System.out.println("Цвет фона треугольника: " + triangle.colorS());
        System.out.println("Цвет границ треугольника: " + triangle.colorP());

    }
}
