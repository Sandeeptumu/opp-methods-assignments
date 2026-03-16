package com.java.methods;

public class Customer {

    int id;
    int order;
    String name;
    String email;
    long phoneNumber;
    String address1;
    boolean isActive;
    long totalOrder;
    long orderPrice1;
    long orderPrice2;
    long orderPrice3;
    boolean orderPayed;
    boolean isDelevered;
    String orderStatus;
    boolean cancelOrder;
    String paymentMethod;
    boolean paymentAmount;
    boolean refundPayment;



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

    public Customer(long orderPrice1, long orderPrice2, long orderPrice3, boolean orderPayed, boolean isDelevered, String orderStatus, boolean cancelOrder) {
        this.orderPrice1 = orderPrice1;
        this.orderPrice2 = orderPrice2;
        this.orderPrice3 = orderPrice3;
        this.orderPayed = orderPayed;
        this.isDelevered = isDelevered;
        this.orderStatus = orderStatus;
        this.cancelOrder = cancelOrder;
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

    Customer(String paymentMethod, boolean paymentAmount) {
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
    }

    void displayPayment() {
        System.out.println("---THE PAYMENT DETAILS---");
    }

    boolean isPaymentAmount(long paymentAmount) {
        if (paymentAmount == totalOrder) {
            System.out.println("Matches the order");
            return true;
        } else {
            System.out.println("Does Not Match The Order ");
            return false;
        }
    }
    boolean isRefundPayment(String refund){
        if (orderStatus == "CANCELLED"){
            System.out.println("Refund Is Possible");
            return true;
        }else{
            System.out.println("Refund Is Not Possible");
            return false;
        }
    }
}

