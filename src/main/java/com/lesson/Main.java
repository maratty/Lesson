package com.lesson;

class Park {
    String name = "Карусель";
    String time = "10.00 - 22.00";
    String price = "100 рублей";

    String age = "с 5 до 10 лет";

    class Inner {
        String nameIn = "наименование парка:";
        String timeIn = "время работы:";
        String priceIn = "стоимость:";
    }
}
public class Main{

    public static void main(String[] args) {
        Park myOuter = new Park();
        Park.Inner myInner = myOuter.new Inner();
        System.out.println(myInner.nameIn + myOuter.name);
        System.out.println(myInner.timeIn + myOuter.time);
        System.out.println(myInner.priceIn + myOuter.price);

    }
}