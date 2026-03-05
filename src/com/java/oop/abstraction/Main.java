package com.java.oop.abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*CreditCardPayment creditCardPayment = new CreditCardPayment();
        OrderWithOutAbstraction order = new OrderWithOutAbstraction(creditCardPayment);
        if (order.processOrderCreditCard(2342323))
            System.out.println("your order has been processed");

        DebitCardPayment debitCardPayment = new DebitCardPayment();
        order = new OrderWithOutAbstraction(debitCardPayment);
        if (order.processOrderDebitCard(56756))
            System.out.println("your order has been processed");

        UPIPayment upiPayment = new UPIPayment();
        order = new OrderWithOutAbstraction(upiPayment);
        if (order.processOrderUPI(678567))
            System.out.println("your order has been processed");*/

        //I have to choose with mode of payment
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter OTP :");
        int otp = scanner.nextInt();
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                CreditCardPayment creditCardPay = new CreditCardPayment();
                Order o = new Order(creditCardPay);
                if (o.processOrder(345343,otp))
                    System.out.println("your order has been processed");
                break;
            case 2:
                DebitCardPayment debitCardPay = new DebitCardPayment();
                Order o2 = new Order(debitCardPay);
                if (o2.processOrder(56756,otp))
                    System.out.println("your order has been processed");
                break;
                case 3:
                    UPIPayment upiPay = new UPIPayment();
                    Order o3 = new Order(upiPay);
                    if(o3.processOrder(678567,otp))
                        System.out.println("your order has been processed");
                    break;
            case 4:

                    Order o4 = new Order();
                    if(o4.payByCash(324523,otp))
                        System.out.println("your order has been processed");
                    break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
