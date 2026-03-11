package com.java.oop.exceptions;

public class CustomerController {
    private final CustomerService customerService;

    public CustomerController() {
        this.customerService = new CustomerService();
    }
    public Customer saveCustomer(Customer customer) throws CustomerExistsException {
        System.out.println("CustomerController -> saveCustomer ");
       return customerService.save(customer);
    }
}
