package lesson5;

class Product {
    String name;
    String date;
    String made ;
    String country;
    int price;
    boolean book;

    Product (String name,String date,String made,String country,int price,boolean book){
        this.name = name; // модель
        this.date = date; // дата производства
        this.made = made; // производитель
        this.country = country; // страна
        this.price = price; // цена
        this.book = book; // наличие
    }
    void  telefon() {
        System.out.println("модель: " + name + "\n"+
                "дата производства: "+date + "\n"+
                "производитель: " + made + "\n"+
                "страна: "+ country + "\n"+
                "цена: "+ price + "\n"+
                "наличие: "+ book);
        System.out.println();
    }

}