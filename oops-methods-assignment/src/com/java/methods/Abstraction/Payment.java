package com.java.methods.Abstraction;

public abstract class Payment  {
    public abstract boolean pay(double amount);

    public void otpValidation(int otp){
        System.out.println("OTP Validation Done using otp: ");

    }

}
