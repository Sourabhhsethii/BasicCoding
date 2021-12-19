package com.oca.training.udemy.strings;

// String is immutable // string cant be changed.
public class StringImmutability {
    public static void main(String[] args) {
        String hello =  "hello";
        String hi = "hello" + "world"; // hi="helloworld"

        hi = hello; // Changing the refernces;
        System.out.println(hi + hello); // hellohello

        hello =  hello.toUpperCase();

        System.out.println(hello);

        // concat
        String s1 = "1" ;
        String s2 = s1.concat("2"); // new string is returned & stored in s2.
        s2.concat("3"); // new string is returned & but not stored in any variable.

        System.out.println(s1); // 1
        System.out.println(s2); // 12

        // String variables can be refernced to any variable

    }
}
