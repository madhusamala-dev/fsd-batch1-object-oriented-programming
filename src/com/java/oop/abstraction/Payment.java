package com.java.oop.abstraction;

public interface Payment {

     boolean pay(double amount);
     boolean pay(double amount, int otp);
     static boolean payByCash(double amount, int otp){
         System.out.println("Your cash payment is done : " + amount);
         System.out.println("With OTP : " + otp);
         return true;
     }
     //method which shouldn't be overridden by subclasses (statci,default)
    default void process(){
         System.out.println("Processing the payment");
    }
}
