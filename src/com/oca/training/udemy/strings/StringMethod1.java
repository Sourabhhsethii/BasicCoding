package com.oca.training.udemy.strings;

import java.util.Locale;

public class StringMethod1 {
    public static void main(String[] args) {

        // 0 1 2 3  4 5 6 7 8 9 10
        // j a v a    i s   f u n
        String str = "Java os fun";
        // length
        System.out.println("length : "+ str.length());

        //charAt
        System.out.println("str " +  str.charAt(0));
        System.out.println("str " +  str.charAt(2));
        System.out.println("str " +  str.charAt(6));
       // System.out.println("str " +  str.charAt(12)); // IndexOutOfBound.

        System.out.println();

        // Index Of
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a', 2));
        System.out.println(str.indexOf("fun"));
        System.out.println(str.indexOf("fun", 10)); // -1 Match Not Found

        System.out.println();

        // substring
        System.out.println(str.substring(8)); // fun

        System.out.println( str.substring(0,5)); // Java

        System.out.println(str.substring(4,4)); // Empty String returbed

         // System.out.println(str.substring(4,2)); // StringIndexOutOfBound
        // System.out.println(str.substring(8,14));  // StringIndexOutOfBound

        System.out.println("AbCd".toLowerCase());
        System.out.println(str.toLowerCase());
        System.out.println(str);

        String dog = "Lucky";
        // dog.toUpperCase(Locale.ROOT);
        dog = dog.toUpperCase(Locale.ROOT);
        System.out.println(dog);

    }
}
