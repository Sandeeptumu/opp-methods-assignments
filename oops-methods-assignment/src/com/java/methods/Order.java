
package com.java.methods;

public class Order {

    long totalOrder;
    long orderPrice1;
    long orderPrice2;
    long orderPrice3;
    boolean orderPayed;
    boolean isDelevered;
    String orderStatus;
    boolean cancelOrder;

    public Order(long orderPrice1, long orderPrice2, long orderPrice3, boolean orderPayed, boolean isDelevered, String orderStatus, boolean cancelOrder) {
        this.orderPrice1 = orderPrice1;
        this.orderPrice2 = orderPrice2;
        this.orderPrice3 = orderPrice3;
        this.orderPayed = orderPayed;
        this.isDelevered = isDelevered;
        this.orderStatus = orderStatus;
        this.cancelOrder = cancelOrder;
    }

    long getTotalOrderAmount() {
        totalOrder = orderPrice1 + orderPrice2 + orderPrice3;
        return totalOrder;
    }

    boolean isOrderPayed() {
        return orderPayed;
    }

    boolean updateOrderStatus(String updatedStatus) {
        if (orderStatus == "PLACED" || orderStatus == "SHIPPED" || orderStatus == "DELIVERED" || orderStatus == "CANCELLED") {
            orderStatus = updatedStatus;
            return true;
        }
        return false;
    }

    boolean cancelOrder(boolean orderCancelDetailes) {
        if (orderStatus == "DELIVERED") {
            System.out.println("Return Is Not Possible");
            return false;
        } else {
            System.out.println("Return Is Possible");
            return true;
        }
    }

    void displayOrderSummary() {
        System.out.println("--ORDER SUMMARY--");
        System.out.println("Total Order Price: " + totalOrder);
        System.out.println("Is Order Payed: " + orderPayed);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Return is Possible: " + cancelOrder);

    }



}