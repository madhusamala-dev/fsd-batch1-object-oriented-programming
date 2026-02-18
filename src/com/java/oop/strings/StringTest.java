package com.java.oop.strings;

public class StringTest {
    public static void main(String[] args) {
        String str = "abcd"; //String literal
        String str1 = new String();
        String str2 = null;
        System.out.println(str1);
        char[] chs = {'m', 'a', 'd', 'h', 'u'};
        String name = new String(chs);
        System.out.println(name);
        ;
        String username = new String(new char[]{'a', 'b', 'c'});
        System.out.println(username);

        String str3 = "abcd";
        String str4 = new String("abcd");
        String str5 = new String("abcd");
        String str6 = "abcd";
        System.out.println(str3 == str6);
        System.out.println(str4 == str5);

        System.out.println(str3.charAt(2));

        username = "madhu";
        System.out.println((username.compareToIgnoreCase("mAdhu")));

        username = username.concat("Hello");
        System.out.println(username); //madhuHello

        username = "madhu";
        String password = "  madhu   ";
        password = password.trim();
        String email = "Madhu@gmail.com";
        System.out.println(email.length());

        if (email.equalsIgnoreCase("madhu@gmail.com") && password.equals("madhu")) {
            System.out.println("login successful");
        } else {
            System.out.println("invalid credentials");
        }

        String empDetails = "111,madhu,madhu@gmail.com,234234";
        String[] empData = empDetails.split(",");

        Customer customer = new Customer(empData[0],empData[1],empData[2],empData[3]);

        System.out.println(customer);



    }
}
