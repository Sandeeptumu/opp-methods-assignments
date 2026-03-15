package com.java.methods;

public class Customer {

    int id;
    String name;
    String email;
    long phoneNumber;
    String address1;
    boolean isActive;
    long totalOrder;
    short orderPrice1;
    short orderPrice2;
    short orderPrice3;
    boolean orderPayed;
    boolean isDelevered;
    String orderStatus;
    boolean cancelOrder;


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

    Customer(int order) {
        orderPrice1 = 30000;
        orderPrice2 = 2300;
        orderPrice3 = 23423;
        orderPayed = true;
        isDelevered = true;
        orderStatus = "SHIPPED";

    }

    long getTotalOrderAmount() {
        totalOrder = orderPrice1 + orderPrice2 + orderPrice3;
        return totalOrder;
    }

    boolean isOrderPayed() {
        return orderPayed;
    }

    boolean updateOrderStatus(String updatedStatus) {
        if (orderStatus == "PLACED" || orderStatus == "SHIPPED" || orderStatus == "DELIVERED" || orderStatus == "CANCELLED") {
            orderStatus = updatedStatus;
            return true;
        }
        return false;
    }

    boolean cancelOrder(boolean orderCancelDetailes) {
        if (orderStatus == "DELIVERED") {
            System.out.println("Return Is Not Possible");
            return false;
        } else {
            System.out.println("Return Is Possible");
            return true;
        }
    }

    void displayOrderSummary() {
        System.out.println("--ORDER SUMMARY--");
        System.out.println("Total Order Price: " + totalOrder);
        System.out.println("Is Order Payed: " + orderPayed);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Return is Possible: " + cancelOrder);

    }

}

