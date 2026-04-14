package com.java.methods.collection;

import com.java.methods.comparator.CustomerIdAscComparator;
import com.java.methods.model.Customer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomerSet {
    public static void main(String[] args) {
        Set<Customer> customers = new TreeSet<>(new CustomerIdAscComparator());

        Customer customer1 = new Customer();
        customer1.setId(10)
                .setEmail("tumusandeep0000@gmail.com")
                .setName("Sandeep")
                .setAddress("Ecil")
                .setPhoneNumber("8008835533");

        Customer customer2 = new Customer();
        customer2.setId(11)
                .setEmail("Sanjay0000@gmail.com")
                .setName("Sanjay")
                .setAddress("Hyderabad")
                .setPhoneNumber("8790899037");

        Customer customer3 = new Customer();
        customer3.setId(12)
                .setEmail("Vishal000@gmail.com")
                .setName("vishal")
                .setAddress("Kesara")
                .setPhoneNumber("8096766073");

        Customer customer4 = new Customer();
        customer4.setId(11)
                .setEmail("Sanjay0000@gmail.com")
                .setName("Sanjay")
                .setAddress("Hyderabad")
                .setPhoneNumber("8790899037");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        System.out.println(customers);
        System.out.println(customers.size());

    }
}
