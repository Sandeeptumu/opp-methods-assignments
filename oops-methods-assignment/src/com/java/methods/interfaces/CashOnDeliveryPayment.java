package com.java.methods.interfaces;

public class CashOnDeliveryPayment implements Payment{

    @Override
    public boolean pay(double amount) {
        Payment.validTransaction(3,123);
        System.out.println("Payment done using credit card: " + amount);
        return true;
    }

    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }
}
