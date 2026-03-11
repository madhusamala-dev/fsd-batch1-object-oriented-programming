package com.java.oop.encapsulation.p1;

public class A {

     int value = 100;

    public A(){
        System.out.println("A() constructor");
    }

    protected void m1(){
        System.out.println("m1()");
    }

    public static void main(String[] args) {
        A a;
        //accessed
        a = new A();
        System.out.println(a.value);
        a.m1();
    }
}
