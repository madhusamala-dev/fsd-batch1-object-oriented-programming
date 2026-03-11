package com.java.oop.exceptions;

public class Main {
    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        Customer customer = null;
        try {
            customer = customerController.saveCustomer(new Customer("111","madhu","madhu@gmail.com"));
        } catch (CustomerExistsException e) {
            System.out.println(e.getMessage());
        }
        if(customer != null)
        System.out.println("Customer saved successfully");
        try {
            customerController.saveCustomer(new Customer("111", "madhu", "madhu@gmail.com"));
        } catch (CustomerExistsException e) {
            System.out.println(e.getMessage());
        }

    }
}
