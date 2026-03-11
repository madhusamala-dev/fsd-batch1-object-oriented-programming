package com.java.oop.exceptions;

import com.java.oop.encapsulation.p1.A;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    List<Customer> customers;

    public CustomerRepository() {
        customers = new ArrayList<>();
    }

    public Customer save(Customer customer){
        System.out.println("CustomerRepository -> save ");
        customers.add(customer);
        return customer;
    }
    public boolean isCustomerExist(String email){
        boolean isExist = false;
        for(Customer customer : customers){
            if(customer.getEmail().equals(email)){
                isExist = true;
                break;
            }
        }
        return isExist;
    }
}
