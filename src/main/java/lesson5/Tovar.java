package lesson5;

class Tovar {
    String name, made, country, booking;
    int date, price;

    public Tovar(String name, int date, String made, String country, int price, String booking) {
        this.name = name; // название
        this.date = date; // дата производства
        this.made = made; // производитель
        this.country = country; // страна происхождения
        this.price = price; // цена
        this.booking = booking; // состояние бронирования покупателем
    }

    public static void main(String[] args) {

        Tovar telefon = new Tovar("телефон", 2024, "nokia", "Китай", 1000, "забронировано");

        System.out.println("Наименование товара:" +telefon.name + "\n" +
                "Дата производства:" + telefon.date + "\n" +
                "Производитель:" + telefon.made + "\n" +
                "Страна происхождения:" + telefon.country + "\n" +
                "Цена:" + telefon.price + "\n" +
                "Состояние бронирования покупателе:" + telefon.booking);
    }
}
