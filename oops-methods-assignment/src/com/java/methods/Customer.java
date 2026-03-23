
package com.java.methods;

public class Customer {

    int id;
    int order;
    String name;
    String email;
    long phoneNumber;
    String address1;
    boolean isActive;



    Customer() {
        System.out.println("THe Customer details is:");
        id = 48;
        name = "Sandeep";
        email = "tumusandeep0000@gmail.com";
        phoneNumber = 8008835533L;
        address1 = "Kushaiguda,Hyderabad";
        isActive = true;
    }

    void displayCustomerDetails() {
        System.out.println("id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number:" + phoneNumber);
        System.out.println("Address: " + address1);
        System.out.println("Active: " + isActive);

    }

    void updateCustomerEmail(String newEmail) {
        email = newEmail;
        System.out.println("Updated Email: " + newEmail);
    }

    void updatePhone(long newPhone) {
        phoneNumber = newPhone;
        System.out.println("updated Phone Number: " + newPhone);
    }

    boolean isCustomerActive(boolean isActive) {
        return isActive;
    }

    boolean deactivateStatus() {
        isActive = false;
        return true;
    }

    static String customerName = "Sandy";
    static String customerAddress = "Ecil,Hyderabad";
    static String customerPhoneNumber= "80085835522";
    static String customerEmail = "tumusandeep0001@gmail.com";
}