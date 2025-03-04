package lesson3;

public class Dog extends Animal{
    String name;
    static int countDod = 0; // делаем статичным, чтобы изменения сохранялись при сложении

    Dog(String name){
        super(); // конструктор родительского класса
        countDod++; // складывает переменную +1
        this.name = name;
    }

    void run(int range) {
        if (range > 500) {
            System.out.println(name + " не может пробежать более 500 метров");
        } else {
            System.out.println(name + " пробежал " + range + " метров");
        }

    }

    void swim(int range) {
        if (range > 10) {
            System.out.println(name + " не может проплыть более 10 метров");
        } else {
            System.out.println(name + " проплыл " + range + " метров");
        }
    }

    static int getCountDod (){
        return countDod;
    }
}
