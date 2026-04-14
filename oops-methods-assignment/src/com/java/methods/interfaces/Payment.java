package com.java.methods.interfaces;

public interface Payment {

    int MAX_PAYMENT_AMOUNT = 100;
    int MAX_TRANSACTIONS_ALLOWED = 2;

    boolean pay(double amount);

    boolean pay(String customerId, double amount);

    default void otpValidation(int otp) {
        System.out.println("OTP Validation Done" + otp);
    }

    static boolean validTransaction(int myTransactionCount, int paymentAmount) {
        if (myTransactionCount > MAX_TRANSACTIONS_ALLOWED && paymentAmount < MAX_PAYMENT_AMOUNT) {
            return true;
        } else {
            return false;
        }
    }
}
