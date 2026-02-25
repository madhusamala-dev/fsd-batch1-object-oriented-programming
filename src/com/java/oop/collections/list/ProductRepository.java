package com.java.oop.collections.list;

import com.java.oop.strings.assignment.Product;

import java.util.ArrayList;

public class ProductRepository {

    private ArrayList<Product> products;

    public ProductRepository(){
        this.products = new ArrayList<>();
    }
    public ArrayList<Product> loadProductsFromCSV(String[] productsCsvData){

        for(String productData : productsCsvData){
            // System.out.println(productData);
            String[] split = productData.split(",");
            Product product = new Product();
            product.setId(split[0]);
            product.setName(split[1]);
            product.setMaxRetailPrice(Double.parseDouble(split[2]));
            product.setDiscountPercentage(Float.parseFloat(split[3]));
            products.add(product);
        }

        //code
        return products;
    }

    public Product save(Product product){
        products.add(product);
        return product;
    }



    public ArrayList<Product> getAll(){
        return  products;
    }

    public Product getById(String id){
        for (Product product : products){
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }
    public Product update(String id, Product product){
        Product byId = getById(id);
        if(byId == null)
            return null;
        else {
            int index = products.indexOf(byId);
            products.set(index,product);
        }
        return product;
    }

    public void delete(Product product){
        products.remove(product);
    }
    public void deleteById(String id){
        Product byId = getById(id);
        if(byId != null)
            products.remove(byId);

    }
    public void displayAllProducts(){

        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-10s %-30s %-10s %-15s%n","ID","NAME","MRP","DISCOUNT %");
        System.out.println("-----------------------------------------------------------------");
        for(Product product : products){
            System.out.printf("%-10s %-30s %-10.2f %-15.2f%n",product.getId(),product.getName(),product.getMaxRetailPrice(),product.getDiscountPercentage());
        }
    }
}
