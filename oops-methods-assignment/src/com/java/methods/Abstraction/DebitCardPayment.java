package com.java.methods.Abstraction;

public class DebitCardPayment extends Payment{
    @Override
    public boolean pay(double amount){
        System.out.println("Payment Done using Debit Cars");
        return true;
    }
}
