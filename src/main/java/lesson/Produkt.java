package lesson;

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

class Products {

    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung s25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Nokia 5230", "02.02.2025", "Nokia Corp.", "Finland",6000, true);
        productsArray[2] = new Product("Iphone 5S", "03.02.2025", "Apple Corp.", "USA", 7000, true);
        productsArray[3] = new Product("lenova 4K", "04.02.2025", "Lenova Corp.", "Shina", 8000, true);
        productsArray[4] = new Product("Sony 4G", "05.02.2025", "Sony Corp", "Japan", 9000, true);

        System.out.println("Список телефонов в наличие:");

        for (Product products : productsArray) {
            if(products.book == true)
                products.telefon();

        }
    }

}