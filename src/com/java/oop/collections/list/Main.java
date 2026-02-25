package com.java.oop.collections.list;

import com.java.oop.strings.assignment.Product;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        String[] productsData = {
                "p-101,Lenovo Laptop,58999.00,10.5",
                "p-102,Dell Inspiron 15,54999.00,8.0",
                "p-103,HP Pavilion 14,62999.00,12.0",
                "p-104,Apple iPhone 14,79999.00,5.0",
                "p-105,Samsung Galaxy S23,74999.00,7.5",
                "p-106,OnePlus 11R,45999.00,9.0",
                "p-107,Boat Rockerz Headphones,2999.00,15.0",
                "p-108,Sony Bravia 43inch TV,52999.00,11.5",
                "p-109,LG Double Door Refrigerator,38999.00,13.0",
                "p-110,Canon EOS 1500D Camera,41999.00,6.5"
        };
       /* Product product = new Product();
        product.setId("p-101");
        product.setName("Lenovo Laptop");
        product.setMaxRetailPrice(2342342);
        product.setDiscountPercentage(10.5F);*/
       // System.out.println(productRepository.save(product));
        System.out.println(productRepository.loadProductsFromCSV(productsData).size());
        System.out.println(productRepository.getAll().size());
        System.out.println(productRepository.getById("p-115"));

        Product productToBeUpdated = new Product();
        productToBeUpdated.setId("p-103");
        productToBeUpdated.setName("Test Name");
        productToBeUpdated.setMaxRetailPrice(11111111);
        productToBeUpdated.setDiscountPercentage(11.11F);

        System.out.println(productRepository.update("p-103", productToBeUpdated));
        System.out.println(productRepository.getById("p-103"));
        System.out.println(productRepository.getAll());

        Product productToBeDeleted = new Product();
        productToBeDeleted.setId("p-109");
        productToBeDeleted.setName("LG Double Door Refrigerator");
        productToBeDeleted.setMaxRetailPrice(38999.00);
        productToBeDeleted.setDiscountPercentage(13.0F);

        productRepository.delete(productToBeDeleted);
        System.out.println(productRepository.getAll());
        productRepository.deleteById("p-108");
        System.out.println(productRepository.getAll());

        productRepository.displayAllProducts();
    }
}
