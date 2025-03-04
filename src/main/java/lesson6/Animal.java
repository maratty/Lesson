package lesson6;

public class Animal {

    static int countAnimal = 0;

    Animal() {
        countAnimal++;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }
}
