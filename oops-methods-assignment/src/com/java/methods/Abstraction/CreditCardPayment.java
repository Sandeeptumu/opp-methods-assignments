package com.java.methods.Abstraction;

public class CreditCardPayment extends Payment {

    @Override
    public boolean pay(double amount){
        System.out.println("Payment done using credit card: " + amount);
        return true;
    }


}
