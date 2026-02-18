package com.java.oop;

public class CallByValue {

    void sum(int no1, int no2){
        System.out.println("--- in sum method");
        no1 = 1000;
        no2 = 2000;
        int sum = no1 + no2;
        System.out.println(no1 + " " + no2);
        System.out.println(sum);

    }


    public static void main(String[] args) {
        CallByValue cv = new CallByValue();
        int no1 , no2;
        no1 = 100;
        no2 = 200;
        cv.sum(no1,no2);
        System.out.println("--- in main method");
        System.out.println(no1 + " " + no2 );
    }
}
