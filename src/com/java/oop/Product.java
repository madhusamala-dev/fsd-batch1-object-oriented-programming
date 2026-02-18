package com.java.oop;

public class Product {
    int id;
    String name;
    float maxRetailPrice;
    float discountPercentage;
    float centralTax, stateTax;

    public Product() {
    }

    public Product(int id, String name, float maxRetailPrice, float discountPercentage, float centralTax, float stateTax) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.centralTax = centralTax;
        this.stateTax = stateTax;
    }

    //methods
    void displayProduct(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("MRP :" + maxRetailPrice);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("State Tax: " + stateTax);
        System.out.println("Central Tax: " + centralTax);
        System.out.println("Discount Amount : " + calculateDiscount());
        System.out.println("Price After Discount : " + priceAfterDiscount());
        System.out.println("State Tax: " + calculateStateTax());
        System.out.println("Central Tax: " + calculateCentralTax());
        System.out.println("Final Bill : " + calculateFinalPrice());
    }
    float calculateDiscount(){
        return maxRetailPrice * discountPercentage / 100;
    }
    float priceAfterDiscount(){
        return maxRetailPrice - calculateDiscount();
    }
    float calculateStateTax(){
        return priceAfterDiscount() * stateTax / 100;
    }
    float calculateCentralTax(){
        return priceAfterDiscount() * centralTax / 100;
    }

    float calculateFinalPrice(){
        //mrp - discount + taxes
        return priceAfterDiscount() + calculateCentralTax() + calculateStateTax();
    }
}
