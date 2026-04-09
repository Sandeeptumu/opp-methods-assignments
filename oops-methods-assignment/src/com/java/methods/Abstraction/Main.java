package com.java.methods.Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Your Option ");
        System.out.println("1. Cash ");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit cad");
        int choice = scanner.nextInt();
        OrderService orderService;
        double amount;
        switch (choice){
            case 1:
                Payment payment = new Payment();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                if (orderService.processOrder(amount))
                    System.out.println("Order Processed Successfully");
                break;
            case 2:
                CreditCardPayment creditCardPayment = new CreditCardPayment();
                orderService = new OrderService(creditCardPayment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                if (orderService.processOrder(amount))
                    System.out.println("Order Processed Successfully through credit card");
                break;
            case 3:
                DebitCardPayment debitCardPayment = new DebitCardPayment();
                orderService  = new OrderService(debitCardPayment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                if (orderService.processOrder(amount))
                    System.out.println("Order Processed Successfully through Debit card");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}