package com.java.oop.abstraction;

public class DebitCardPayment implements Payment {

    @Override
    public boolean pay(double amount) {
        process();
        System.out.println("Amount : "  + amount + " " +
                "is processed through debit card ");
        return true;
    }

    @Override
    public boolean pay(double amount, int otp) {
        process();
        System.out.println("Amount : "  + amount + " " +
                "is processed through debit card using OTP :" + otp);
        return true;
    }
}
