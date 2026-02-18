package com.java.oop.arrays;

public class Customer {
    String id;
    String name;
    String email;

    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void displayCustomerDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
