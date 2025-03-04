package lesson3;

public class MainAnimal {
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
        System.out.println("Общее количество котов: "+ Cat.getCountCat());
        System.out.println("Общее количество собак: "+ Dog.getCountDod());

    }
}
