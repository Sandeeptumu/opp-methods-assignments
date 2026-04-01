package com.java.methods.inheritance;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println("ID: " +product.id);
        product.displayProductDetails();

        Product product1 = new Product(true,2.5f,25,"Stand",202);
        product1.displayProductDetails();

        Laptop laptop = new Laptop();
        System.out.println(laptop.id);
        System.out.println(laptop.graphicCard);

        Laptop laptop1 = new Laptop(true,3.4f,54,"mac",23,"RTX4050",84547L,32,"Macos",16);
        laptop1.displayProductDetails();
        laptop1.displayLaptopDetails();

        Book book = new Book();
        System.out.println(book.author);

        Book Book1 = new Book(true,20,85,"The End",101,856L,"Sandeep",305);
        Book1.displayProductDetails();
        Book1.displayBookDetails();

        Service service = new Service();
        service.validate(Book1);

    }
}
