package com.oca.training.udemy.test.test2;

import java.util.function.Predicate;

public class Test7 {
    public static void main(String[] args) {
        String [] arr = {"*", "**", "***", "****", "*****"};
        //Predicate pr1 = s -> s.length() < 4;
        print(arr, p -> p.length()<4);
        m1(null);
    }

    private static void print(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }

    static void m1(CharSequence s) {
       // CharSequence s1 = null;
        System.out.println("CharSequence");
    }

    static void m1(String s) {
      //  String s2 = null;
        System.out.println("String");
    }

    static void m1(Object s) {
        System.out.println("Object");
    }
}