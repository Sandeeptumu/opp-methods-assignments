package com.java.methods.Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Your Option ");
        System.out.println("1. Cash On delivery ");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit cad");
        System.out.println("4. Upi");
        int choice = scanner.nextInt();
        OrderService orderService;
        double amount;
        int otp;
        Payment payment;
        switch (choice) {
            case 1:
                payment = new CashOnDelivery("1", "Sandeep", "1-02-2025", "Cash On Delivery");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP: ");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (orderService.processOrder(amount))
                    System.out.println("Order Processed Successfully");
                break;
            case 2:
                payment = new CreditCardPayment("2", " Kushaal", "12-03-2026", "Credit Card");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP: ");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (orderService.processOrder(amount))
                    System.out.println("Order Processed Successfully through credit card");
                break;
            case 3:
                payment = new DebitCardPayment("3", "Kutty", "4-02-2026", "Debit Card");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP: ");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (orderService.processOrder(amount))
                    System.out.println("Order Processed Successfully through Debit card");
                break;
            case 4:
                payment = new UpiPayment("4", "Mahi", "19-03-2003", "UPI");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP: ");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (orderService.processOrder(amount))
                    System.out.println("Order Processed Successfully through upi");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}