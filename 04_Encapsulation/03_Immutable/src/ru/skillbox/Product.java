package ru.skillbox;


public class Product {
    private final  String name;

    public int barCode;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    private   int price;

}
