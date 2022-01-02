package com.oca.training.udemy.test.test1;

public class Test12 {
    public static void main(String[] args) {
        try {
            main(args); //StackOverflowError
        } catch (Exception ex) {
            System.out.println("CATCH-");
        }
        System.out.println("OUT");
    }
}