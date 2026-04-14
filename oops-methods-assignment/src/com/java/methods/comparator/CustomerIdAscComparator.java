package com.java.methods.comparator;

import com.java.methods.model.Customer;

import java.util.Comparator;

public class CustomerIdAscComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getId() - c2.getId();
    }
}
