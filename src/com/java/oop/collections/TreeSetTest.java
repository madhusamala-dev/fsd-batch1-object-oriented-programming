package com.java.oop.collections;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> nameSet = new TreeSet<>();
        nameSet.add("Madhu");
        nameSet.add("Adhitya");
        nameSet.add("Nithin");
        nameSet.add("Manikanta");
        nameSet.add("Madhu");

        System.out.println(nameSet);

        TreeSet<Customer> customerSet = new TreeSet<>();
        customerSet.add(new Customer("111","Madhu","madhu@gmail.com"));
        customerSet.add(new Customer("333","Aadhitya","aadhitya@gmail.com"));
        customerSet.add(new Customer("222","Nithin","nithiin@gmail.com"));
        customerSet.add(new Customer("444","Manikanta","manikanta@gmail.com"));
        System.out.println(customerSet);


    }
}
