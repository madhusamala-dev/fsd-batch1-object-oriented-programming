package com.java.oop.abstraction;

public class CreditCardPayment implements Payment {


   @Override
    public boolean pay(double amount) {
       process();
        System.out.println("Amount : "  + amount + " " +
                "is processed through credit card ");

        return true;
    }

    @Override
    public boolean pay(double amount, int otp) {
       process();
        System.out.println("Amount : "  + amount + " " +
                "is processed through credit card with OTP " + otp);
        return true;
    }


}
