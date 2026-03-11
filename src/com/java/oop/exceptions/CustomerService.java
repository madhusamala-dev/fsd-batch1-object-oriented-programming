package com.java.oop.exceptions;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService() {
        customerRepository = new CustomerRepository();
    }

    public Customer save(Customer customer) throws CustomerExistsException {
        System.out.println("CustomerService -> save ");
        /*
        1. check customer exists with this email
        2. if exists throw UserExistsException
        3. else save a new user
         */
            if (customerRepository.isCustomerExist(customer.getEmail())) {
                throw new CustomerExistsException("Customer already exists with this email: " + customer.getEmail());

            }
        return customerRepository.save(customer);
    }
}
