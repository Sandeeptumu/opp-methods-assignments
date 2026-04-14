package com.java.methods.interfaces;

public class CreditCardPayment implements Payment{

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment Done Successfully: " +amount);
        return true;
    }

    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }
}
