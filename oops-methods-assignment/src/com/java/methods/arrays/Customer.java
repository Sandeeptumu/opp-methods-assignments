package com.java.methods.arrays;

public class Customer {
    public int id;
    public String name;
    public String email;
    public String phoneNumber;
    public String address;
    public byte age;
    public char gender;

    public Customer(int id, String name, String email, String phoneNumber, String address, byte age, char gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    void displayCustomerDetails() {
        System.out.println("=====CUSTOMER DETAILS=====");
        System.out.println("id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number:" + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

}
