package com.java.methods.inheritance;

public class Service {
    void validate(Product product) {
        System.out.println("Validate Product");
    }

    void displayDetails(Product product){
        product.displayDetails();
    }
}
