package com.java.methods;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.displayCustomerDetails();

        customer.updateCustomerEmail("tumusandeep0001@gmail.com");
        customer.updatePhone(8008835522L);

        boolean active = customer.isCustomerActive(true);
        System.out.println("The active Status Of Customer: " + active);

        boolean deactivate = customer.deactivateStatus();
        System.out.println("The account deactivated: "+deactivate);

        System.out.println("----THE ORDER DETAILS----");

        Customer order = new Customer(1233,3345,2346,true,true,"DELIVERED",false);

        long totalAmount = order.getTotalOrderAmount();
        System.out.println("The Total Amount Of The Order Is: " + totalAmount);

        boolean orderPayed = order.isOrderPayed();{
            System.out.println("Order Is Payed: " +orderPayed);
        }

        boolean updatedOrderStatus = order.updateOrderStatus("SHIPPING");
            System.out.println("Order Status:  "+ updatedOrderStatus);

        boolean cancelOrder  = order.cancelOrder(true);
        System.out.println("ORDER CAN BE CANCELED: " +cancelOrder);

        order.displayOrderSummary();

        Customer payment =new Customer ("UPI",true);

        payment.displayPayment();

        payment.isPaymentAmount(6924);

        payment.isRefundPayment();

    }
}