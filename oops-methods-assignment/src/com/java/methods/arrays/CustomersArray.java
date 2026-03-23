package com.java.methods.arrays;

public class CustomersArray {
    public static void main(String[] args) {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(1, "Sandy", "sandeep000@gmailo.com", "8008835533", "Ecil", (byte) 20, 'M');
        customers[1] = new Customer(2, "Kushaal", "kushaal0000@gmai.com", "9705902575", "Hyderabad", (byte) 22, 'M');
        customers[2] = new Customer(3, "Lalith", "lalith0000@gmai.com", "9177306807", "Ecil", (byte) 21, 'M');
        customers[3] = new Customer(4, "Akshitha", "akshitha0000@gmai.com", "879082575", "KarimNagar", (byte) 20, 'F');
        customers[4] = new Customer(5, "Geetha", "geetha0000@gmai.com", "8096799037", "vijayawadha", (byte) 25, 'F');

        for (Customer customer : customers) {
            customer.displayCustomerDetails();
        }

        Customer heighestAgeCustomer = customers[0];

        for (Customer customer : customers) {
            if (customer.age > heighestAgeCustomer.age) {
                heighestAgeCustomer = customer;
            }
        }

        heighestAgeCustomer.displayCustomerDetails();
        System.out.println("Male Count: "+getMaleCustomerCount(customers));
        System.out.println("Female Count: " +getFemaleCustomerCount(customers));
        System.out.println("Customer Details: " +getCustomerById(customers,1));
        System.out.println("Customer Age: " +getHighestAgedCustomer(customers));
        System.out.println("Customers Age grater than 20: " +customerWithAgeGraterThan(customers, (byte) 20));

    }


    public static int getMaleCustomerCount(Customer[] customers) {
        int maleCount = 0;
        for (Customer customer : customers) {
            if (customer.gender == 'M'){
                maleCount++;
            }
        }
        return maleCount;
    }

    public static int getFemaleCustomerCount(Customer[] customers) {
        int FemaleCount = 0;
        for (Customer customer : customers) {
            if (customer.gender == 'F'){
                FemaleCount++;
            }
        }
        return FemaleCount;
    }

    public static Customer getCustomerById(Customer[] customers, int id){
        for (Customer customer : customers){
            if (customer.id == id){
                return customer;
            }
        }
        return null;
    }

    public static Customer getHighestAgedCustomer(Customer[] customers){
        Customer highest = customers[0];
        for (Customer customer : customers){
            if (customer.age > highest.age)
                highest = customer;
            }
        return highest;
        }

    public static Customer[] customerWithAgeGraterThan(Customer[] customers, byte age){
        int count = 0;
        for (Customer customer : customers){
            if (customer.age > age){
                count++;
            }
        }
        Customer[] result = new Customer[count];

        int index = 0;
        for(Customer customer : customers){
            if(customer.age > age){
                result[index] = customer;
                index++;
            }
        }
        return customers;
    }


}
