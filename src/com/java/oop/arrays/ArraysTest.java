package com.java.oop.arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] ids; //declaration
        ids = new int[4]; //instantiation
        System.out.println(ids[0]);
        ids[0] = 111; //initialize
        ids[1] = 222;
        ids[2] = 333;
        ids[3] = 444;

        int[] rollNos = {111, 222, 333, 444 };
        System.out.println(rollNos.length);
        System.out.println(rollNos[2]);

        for(int index = 0 ; index < rollNos.length ; index++){
            System.out.println(rollNos[index]);
        }

        //for-each rollNo in rollNos
        for(int rollNo : rollNos){
            System.out.println(rollNo);
        }

        for(int id : ids){
            System.out.println(id);
        }
        char[] genders = {'M', 'F', 'F', 'M'};
        for(char gender : genders){
            System.out.println(gender);
        }

        String[] names = { "madhu", "aadhithya", "aryan", "nithin"};

        for(String name : names){
            System.out.println(name);
        }

        Customer[] customers = { new Customer("111","customer1","customer1@gmail.com"),
        new Customer("222","customer2", "customer2@gmail.com"),
        new Customer("333", "customer3", "customer3@gmail.com")};
        System.out.println(customers.length);
        System.out.println(customers[0]);
        System.out.println(customers[1].name);
        for(Customer customer: customers){
            System.out.println(customer.name);
        }

        System.out.println("--------------------");
        for(Customer customer : customers){
            customer.displayCustomerDetails();
        }



    }
}
