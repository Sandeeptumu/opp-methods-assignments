package com.java.methods.inheritance;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println("ID: " + product.id);
        product.displayDetails();

        Product product1 = new Product(true, 2.5f, 25, "Stand", 202);
        product1.displayDetails();

        Laptop laptop = new Laptop();
        System.out.println(laptop.id);
        System.out.println(laptop.graphicCard);

        Laptop laptop1 = new Laptop(true, 3.4f, 54, "mac", 23, "RTX4050", 84547L, 32, "Macos", 16);
        laptop1.displayDetails();
        laptop1.displayDetails();

        Book book = new Book();
        System.out.println(book.author);

        Book book1 = new Book(true, 20, 85, "The End", 101, 856L, "Sandeep", 305);
        book1.displayDetails();
        book1.displayDetails();

        WindowsLaptop windowsLaptop = new WindowsLaptop();
        Service service = new Service();
        service.validate(windowsLaptop);

        windowsLaptop.displayDetails();
        windowsLaptop.displayDetails("Legion");
        windowsLaptop.displayDetails("legion",23);

        service.displayDetails(product1);
        service.displayDetails(laptop1);
        service.displayDetails(book1);

    }
}
