package com.java.methods.Abstraction;

public class UpiPayment extends Payment {

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done using UPI " + amount);
        return true;
    }
}
