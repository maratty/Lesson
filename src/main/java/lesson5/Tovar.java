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

}