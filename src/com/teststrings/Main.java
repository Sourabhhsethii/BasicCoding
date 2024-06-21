package com.teststrings;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        var s = "test this example";
        System.out.println(s.length());
        System.out.println(s.charAt(0));

        System.out.println(s.indexOf("t"));
        System.out.println(s.indexOf("t",2));
        System.out.println(s.indexOf('t',3));
        System.out.println(s.indexOf(5));

        System.out.println(s.substring(0,2));
        System.out.println(s.substring(2,3));
        System.out.println(s.substring(2,4));



        System.out.println(s.toLowerCase().toUpperCase());

        // Error Cases

        System.out.println(s.substring(2,5));
        System.out.println(s.substring(2,1));
        System.out.println(s.charAt(5));

    }
}
