package com.java.oop.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<Customer> customers = new LinkedHashSet<>();
        customers.add(new Customer("111","customer1","customer1@gmail.com"));
        customers.add(new Customer("222","customer2","customer2@gmail.com"));
        customers.add(new Customer("333","customer3","customer3@gmail.com"));
        customers.add(new Customer("111","customer1","customer1@gmail.com"));
        System.out.println(customers.size());
        for (Customer customer: customers){
            System.out.println(customer);
        }
        //code to remove customer with id 222



    }
}
