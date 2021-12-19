package com.oca.training.udemy.strings;

public class StringConcatemation {
    public static void main(String[] args) {
        String text = "hello";
        String anotherText = new String("hello");

        System.out.println(text == anotherText);
        System.out.println(text.equals(anotherText));

        System.out.println( 2 + 3);
        System.out.println( "a" + "b");
        System.out.println(1 + 2 + "d" + 5 + 6);

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + 8 + four + 9);

        int number = 10;
        int anotherNumber = 20;
        System.out.println("result " + number + anotherNumber); // result 1020
        System.out.println("result " + (number + anotherNumber)); // result 1020

        String str = "";
        for(int i=0;i<10;i++){
            str += i;
        }
        System.out.println(str);

        String hello = "hello";
        String world = " world";
        String helloworld = hello + world;

        System.out.println(hello);
    }
}
