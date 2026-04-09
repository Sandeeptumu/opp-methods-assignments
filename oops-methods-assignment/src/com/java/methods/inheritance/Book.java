package com.java.methods.inheritance;

public class Book extends Product {
    long price;
    String author;
    int pages;

    public Book() {
        System.out.println("Book Constructor called");
    }

    public Book(boolean isAvailable, float discountPercentage, int maxRetailPrice, String name, int id, long price, String author, int pages) {
        super(isAvailable, discountPercentage, maxRetailPrice, name, id);
        this.price = price;
        this.author = author;
        this.pages = pages;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Price: " + price);
        System.out.println("Author: " + author);
        System.out.println("pages: " + pages);
    }

}
