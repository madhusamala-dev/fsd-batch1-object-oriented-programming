package com.java.oop.exceptions;

import java.util.Scanner;

public class ExceptionTest {

    static String getUsername(){
        String username;
        username = null;
        return username;
    }
    public static void main(String[] args) {
        try {
            System.out.println("important resources created");
            try {
                int averageMarks = 300 / 0;
                System.out.println(averageMarks);

            } catch (ArithmeticException e) {
                System.out.println("some internal error occured. Please try again later");
                input();

            }
            try {
                String username = getUsername();
                if (username.equals("madhu"))
                    System.out.println("valid user");
            } catch (NullPointerException e) {
                System.out.println("username is null");
            }

            int[] ids = new int[5];
            ids[10] = 23432;
        } catch(Exception e){

            System.out.println("some internal error occured. Please try again later :" + e.getMessage());
            input();
        } finally {
            System.out.println("important resources destroyed");
        }

        /*catch(ArithmeticException e) {
            System.out.println("some internal error occured. Please try again later");
            input();
        } catch(NullPointerException e) {
            System.out.println("username is null");
            input();
        } catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Some issue in array");
            input();
        }*/
        /*catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bounds");
        }*/
    }

    private static void input() {
        System.out.println("input continues...");
    }
}
