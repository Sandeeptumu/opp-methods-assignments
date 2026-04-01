package com.java.methods.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    boolean isAvailable;

    public Product(){
        System.out.println("Product Constructor is called ");
    }

    public Product(boolean isAvailable, float discountPercentage, int maxRetailPrice, String name, int id) {
        this.isAvailable = isAvailable;
        this.discountPercentage = discountPercentage;
        this.maxRetailPrice = maxRetailPrice;
        this.name = name;
        this.id = id;
    }

    void displayProductDetails(){
        System.out.println("ID " +id);
        System.out.println("Discount: " +discountPercentage);
        System.out.println("Retail Price: " +maxRetailPrice);
        System.out.println("name: " +name);
        System.out.println("Available: " +isAvailable);
    }

}
