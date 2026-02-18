package com.java.oop;

public class Test {

    Test t1;
    int no;

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.no = 1000;

        System.out.println(t1.t1);
        Test t2 = new Test();
        t2 = t1;
        t1.t1 = new Test();
        System.out.println(t1.t1.no);
    }
}
