package com.java.methods.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    boolean isAvailable;

    public Product() {
        System.out.println("Product Constructor is called ");
    }

    public Product(boolean isAvailable, float discountPercentage, int maxRetailPrice, String name, int id) {
        this.isAvailable = isAvailable;
        this.discountPercentage = discountPercentage;
        this.maxRetailPrice = maxRetailPrice;
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("ID " + id);
        System.out.println("Discount: " + discountPercentage);
        System.out.println("Retail Price: " + maxRetailPrice);
        System.out.println("name: " + name);
        System.out.println("Available: " + isAvailable);
    }

    void displayDetails(String company) {
        System.out.println("Company" + company);
    }

    void displayDetails(String company, int year) {
        System.out.println("Company: " + company + " Year: " + year);
    }
}
