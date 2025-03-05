package lesson5;

class Main {
    public static void main(String[] args) {

        Tovar telefon = new Tovar("телефон", 2024, "nokia", "Китай", 1000, "забронировано");
        System.out.println("Наименование товара:" +telefon.name + "\n" +
                "Дата производства:" + telefon.date + "\n" +
                "Производитель:" + telefon.made + "\n" +
                "Страна происхождения:" + telefon.country + "\n" +
                "Цена:" + telefon.price + "\n" +
                "Состояние бронирования покупателе:" + telefon.booking);
        System.out.println(" ");


        Park myOuter = new Park();
        Park.Inner myInner = myOuter.new Inner();

        System.out.println(myInner.nameIn + myOuter.name);
        System.out.println(myInner.timeIn + myOuter.time);
        System.out.println(myInner.priceIn + myOuter.price);
        System.out.println(" ");


        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung s25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Nokia 5230", "02.02.2025", "Nokia Corp.", "Finland", 6000, true);
        productsArray[2] = new Product("Iphone 5S", "03.02.2025", "Apple Corp.", "USA", 7000, true);
        productsArray[3] = new Product("lenova 4K", "04.02.2025", "Lenova Corp.", "Shina", 8000, true);
        productsArray[4] = new Product("Sony 4G", "05.02.2025", "Sony Corp", "Japan", 9000, true);

        System.out.println("Список телефонов в наличие:");

        for (Product products : productsArray) {
            if (products.book == true)
                products.telefon();
        }
    }

}