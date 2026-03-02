package com.java.oop.polymorphism;

import com.java.oop.inheritance.Customer;
import com.java.oop.inheritance.PremiumCustomer;
import com.java.oop.inheritance.RegularCustomer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("1", "Madhu Samala", "madhu@gmail.com", "54645345");
        RegularCustomer regularCustomer = new RegularCustomer("2", "Madhu Samala1", "madhu1@gmail.com", "54645345", 2342, 23, 500);
        PremiumCustomer premiumCustomer = new PremiumCustomer("3", "Madhu Samala2", "madhu2@gmail.com", "54645345", true, 5000);

        CustomerService customerService = new CustomerService();
         //customerService.displayCustomerDetails(customer);
         //customerService.displayCustomerDetails(regularCustomer);
        customerService.displayCustomerDetails(premiumCustomer);
    }
}
