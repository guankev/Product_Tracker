package com.dev.haskin.product_tracker;

public class Product {
    final public String name;
    final private int price;
    final private float tax;
    public Product(String name){
        this.name = name;
        this.price = 0;
        this.tax = 0;
    }
}
