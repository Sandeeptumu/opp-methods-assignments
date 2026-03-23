
package com.java.methods;

public class Payment {
    String paymentMethod;
    boolean paymentAmount;
    boolean refundPayment;
    boolean orderStatus;

    Payment(String paymentMethod, boolean paymentAmount) {
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
    }

    void displayPayment() {
        System.out.println("---THE PAYMENT DETAILS---");
    }

    boolean isPaymentAmountMatch(long paymentAmount, long orderTotal) {

        if (paymentAmount == orderTotal) {
            System.out.println("Payment Matches Order");
            return true;
        } else {
            System.out.println("Payment Does Not Match");
            return false;
        }
    }

    boolean isRefundPayment(){
        if (orderStatus){
            System.out.println("Refund Is Possible");
            return true;
        } else {
            System.out.println("Refund Is Not Possible");
            return false;
        }
    }

}