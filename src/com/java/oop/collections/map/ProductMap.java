package com.java.oop.collections.map;

import com.java.oop.strings.assignment.Product;

import java.util.*;

public class ProductMap {
    public static void main(String[] args) {
        TreeMap<String, Product> productHashMap = new TreeMap<>();
        productHashMap.put("p-101",new Product("p-101","Lenovo laptop",23423,10.5F));
        productHashMap.put("p-105",new Product("p-105","Samsung laptop",22222,2.5F));
        productHashMap.put("p-102",new Product("p-102","apple laptop",33333,3.3F));

        System.out.println(productHashMap);

        Set<Map.Entry<String, Product>> entries = productHashMap.entrySet();
        Iterator<Map.Entry<String, Product>> iterator = entries.iterator();
       while(iterator.hasNext()){
           Map.Entry<String, Product> next = iterator.next();
           System.out.println(next.getKey() + " " + next.getValue());
        }
    }
}
