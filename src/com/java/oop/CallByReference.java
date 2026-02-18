package com.java.oop;

public class CallByReference {

    int no1 , no2;
    void sum(CallByReference cb){
        cb = new CallByReference();
        cb.no1 = 1000;
        cb.no2 = 2000;
        int sum;
        sum = cb.no1 + cb.no2;
        System.out.println(sum);
        System.out.println("no1 : " + cb.no1 + " " + "no2 : "+ cb.no2);
    }

    public static void main(String[] args) {
        CallByReference cb = new CallByReference();
        cb.no1  = 100;
        cb.no2 = 200;
        cb.sum(cb);
        System.out.println("no1 : " + cb.no1 + " "+ "no2 : " + cb.no2);
    }
}
