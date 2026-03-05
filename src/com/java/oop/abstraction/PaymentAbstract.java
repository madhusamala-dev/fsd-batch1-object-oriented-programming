package com.java.oop.abstraction;

public abstract class PaymentAbstract {

    public abstract boolean pay(double amount);
    public abstract boolean pay(double amount, int otp);

    public static boolean payByCash(double amount, int otp){
        System.out.println("Your cash payment is done : " + amount);
        System.out.println("With OTP : " + otp);
        return true;
    }
}
