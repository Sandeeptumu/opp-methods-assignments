package com.java.methods.Abstraction;

public class CashOnDelivery extends Payment{
    @Override
    public boolean pay(double amount){
        System.out.println("Payment done using cash on delivery");
        return true;
    }

}
