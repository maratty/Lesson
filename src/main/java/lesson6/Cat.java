package lesson6;

public class Cat extends Animal{
    String name;
    static int countCat = 0;


    Cat(String name){
        super();
        countCat++;
        this.name = name;

    }

    void run(int range) {
        if (range > 200) {
            System.out.println(name + " не может пробежать более 200 метров");
        } else {
            System.out.println(name + " пробежал " + range + " метров");
        }
    }

    void swim(int range) {
        System.out.println(name + " не может плавать");
    }

    void may(int eda) {
        if (eda > 10) {
            System.out.println(name + " покушал, наелся, теперь пора спать");
        }
        else if(eda<0){
            System.out.println(name + " не может сьесть отрицательную еду");
        }
        else {
            System.out.println("Вы положили недостаточно еды, положите больше 10, иначе " + name+ " останеться голодным");
        }
    }
    static int getCountCat(){
        return countCat;
    }

}

