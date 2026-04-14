package com.java.methods.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Your Option ");
        System.out.println("1. Cash On delivery ");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit cad");
        System.out.println("4. Upi");
        System.out.println("Enter Your Choice");
        int choice = scanner.nextInt();
        OrderService orderService;
        double amount;
        int otp;
        Payment payment;
        switch (choice) {
            case 1:
                payment = new CashOnDeliveryPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                if (orderService.processOrder(amount))
                    System.out.println("Order Processed Successfully");
                break;
            case 2:
                payment = new CreditCardPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                if (orderService.processOrder(amount))
                    System.out.println("Order Processed Successfully through credit card");
                break;
            case 3:
                payment = new DebitCardPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                if (orderService.processOrder(amount))
                    System.out.println("Order Processed Successfully through Debit card");
                break;
            case 4:
                payment = new UpiPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                if (orderService.processOrder(amount))
                    System.out.println("Order Processed Successfully through upi");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
