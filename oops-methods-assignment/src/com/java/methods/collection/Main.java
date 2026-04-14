package com.java.methods.collection;

import com.java.methods.model.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setId(23)
                .setEmail("tumusandeep0000@gmail.com")
                .setName("Sandeep")
                .setAddress("Ecil")
                .setPhoneNumber("8008835533");

        System.out.println("Name: " + customer.getName());
        System.out.println("Id: " + customer.getId());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("address: " + customer.getAddress());
        System.out.println("Phone Number: " + customer.getPhoneNumber());

        System.out.println(customer);
    }


}
