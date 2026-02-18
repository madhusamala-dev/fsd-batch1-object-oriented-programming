package com.java.oop;

public class Main {

    public static void main(String[] args) {
        Product product1; //reference variable
        Product product2;
        product1 = new Product();
        product2 = new Product();
        new Product();
        new Product();
        /*int no ;
        System.out.println(no); local variable */
        product1.id = 11241;
        product1.name = "Lenovo Laptop";
        product1.discountPercentage = 5.5F;
        product1.maxRetailPrice = 234232;

        product2.id = 23423;
        product2.name = "Samsung mobile phone";
        product2.maxRetailPrice = 45654;
        product2.discountPercentage = 6.5F;
        System.out.println("Product Name : " + product1.name);
        System.out.println("Product Name : " + product2.name);

        Product product3;
        product3 = new Product(23423, "Iphone", 23423.234F, 7.5F, 2.5F,2.5F);

        System.out.printf("Product ID        : %05d%n", product1.id);
        System.out.printf("Product Name      : %-20s%n", product1.name);
        System.out.printf("MRP               : ₹%8.2f%n", product1.maxRetailPrice);
        System.out.printf("Discount          : %-5.2f%%%n", product1.discountPercentage);
        System.out.printf("Central Tax (CGST): %-5.2f%%%n", product1.centralTax);



        //Printing in table format

        System.out.printf(
                "%-5s %-20s %-15s %-12s %-10s%n",
                "ID", "NAME", "MRP", "DISCOUNT", "CGST"
        );

        System.out.println("-------------------------------------------------------------");

        System.out.printf(
                "%-5d %-20s ₹%-15.2f %-4.2f%%       %-4.2f%%%n",
                product1.id, product1.name, product1.maxRetailPrice, product1.discountPercentage, product1.centralTax
        );

        System.out.printf(
                "%-5d %-20s ₹%-15.2f %-4.2f%%       %-4.2f%%%n",
                product2.id, product2.name, product2.maxRetailPrice, product2.discountPercentage, product1.centralTax
        );

        float discount = product3.calculateDiscount();
        System.out.println("Discount : " + discount);

        product3.displayProduct();
        /*System.out.println("Discount Amount : " + product3.calculateDiscount());
        System.out.println("Price After Discount : " + product3.priceAfterDiscount());
        System.out.println("State Tax: " + product3.calculateStateTax());
        System.out.println("Central Tax: " + product3.calculateCentralTax());
        System.out.println("Final Bill : " + product3.calculateFinalPrice());*/
    }
}
