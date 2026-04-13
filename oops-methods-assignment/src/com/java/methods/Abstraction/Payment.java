package com.java.methods.Abstraction;

public abstract class Payment  {

    String id;
    String customerName;
    String paymentDate;
    String mode;

    public Payment(String id, String customerName, String paymentMethod, String mode) {
        this.id = id;
        this.customerName = customerName;
        this.paymentDate = paymentMethod;
        this.mode = mode;
    }

    public abstract boolean pay(double amount);

    public void otpValidation(int otp){
        System.out.println("OTP Validation Done using otp: ");
    }

    public void paymentDetails(){
        System.out.println("Customer Id: " +id);
        System.out.println("Customer Name: " +customerName);
        System.out.println("Payment Date: " +paymentDate);
        System.out.println("Mode Of Payment: " +mode);
    }

}
