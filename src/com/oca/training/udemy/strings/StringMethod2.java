package com.oca.training.udemy.strings;

public class StringMethod2 {

    public static void main(String[] args) {
        String str = "java";
        String str2 = "Java";
        String st3 = "ja";

        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        System.out.println(" // startsWith /");

        // startsWith / endsWith
        System.out.println(str.startsWith("j"));
        System.out.println(str.startsWith(st3));
        System.out.println(str.startsWith("J"));
        System.out.println(str.endsWith("av"));

        System.out.println("/ contains /");
        System.out.println(str.contains(st3));
        System.out.println(str.contains("av"));
        System.out.println("Java".contains("j"));

        //replace
        String myString = "Java" + " " + "is" + " " + "cool";
        System.out.println(myString.replace('a','A'));
        System.out.println(myString.replace("","_"));
        System.out.println(myString.replace("is","_"));

        System.out.println("/ trim /");
        //trim
        System.out.println("Java".trim());
        System.out.println("Java is cool ");
        System.out.println("Java is cool ".trim());

    }
}
