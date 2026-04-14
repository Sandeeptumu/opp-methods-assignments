package com.java.methods.interfaces;

public class DebitCardPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done using credit card: " + amount);
        return true;
    }

    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }
}
