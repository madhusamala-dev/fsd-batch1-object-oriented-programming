package com.java.oop.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
    public static void main(String[] args) {

        /*HashSet namesSet;
        namesSet = new HashSet();
        namesSet.add(1111);
        namesSet.add(234234.23423);
        namesSet.add("Madhu");
        namesSet.add("St School");*/

        HashSet<String> namesSet = new HashSet<>();
        namesSet.add("Madhu");
        namesSet.add("st school");
        namesSet.add("Madhu");
        namesSet.add("Samalaa");

        System.out.println(namesSet);
        System.out.println(namesSet.size());

        HashSet<Customer> customersSet = new HashSet<>();
        customersSet.add(new Customer("111","customer1","customer1@gmail.com"));
        customersSet.add(new Customer("222","customer2","customer2@gmail.com"));
        customersSet.add(new Customer("333","customer3","customer3@gmail.com"));
        customersSet.add(new Customer("111","customer1","customer1@gmail.com"));

        System.out.println(customersSet.size());

        /*Iterator<Customer> customerIterator = customersSet.iterator();
        while(customerIterator.hasNext()){
          Customer customer =   customerIterator.next();
            System.out.println(customer);
        }*/
       // customersSet.remove(new Customer())
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer Id: ");
        String id = scanner.next();

        //write the code to delete the customer from set

        Iterator<Customer> customerIterator = customersSet.iterator();
        while(customerIterator.hasNext()){
            Customer customer =   customerIterator.next();
            if(customer.getId().equals(id)){
                customerIterator.remove();
            }
        }
        System.out.println(customersSet);


    }
}
