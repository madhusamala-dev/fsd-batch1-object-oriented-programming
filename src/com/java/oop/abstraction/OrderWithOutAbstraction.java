package com.java.oop.abstraction;

public class OrderWithOutAbstraction {
    CreditCardPayment creditCardPayment;
    DebitCardPayment debitCardPayment;
    UPIPayment upiPayment;

    public OrderWithOutAbstraction(CreditCardPayment creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }

    public OrderWithOutAbstraction(DebitCardPayment debitCardPayment) {
        this.debitCardPayment = debitCardPayment;
    }

    public OrderWithOutAbstraction(UPIPayment upiPayment) {
        this.upiPayment = upiPayment;
    }

    public boolean processOrderCreditCard(double amount){
        this.creditCardPayment.pay(amount);
        return true;
    }

    public boolean processOrderDebitCard(double amount){
        this.debitCardPayment.pay(amount);
        return true;
    }
    public boolean processOrderUPI(double amount){
        this.upiPayment.pay(amount);
        return true;
    }


}
