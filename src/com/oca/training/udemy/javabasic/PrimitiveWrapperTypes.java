package com.oca.training.udemy.javabasic;


public class PrimitiveWrapperTypes {
    public static void main(String[] args) {
        int myInt = 10;
        Integer myInterger1 = 10;
        Integer myInterger2 = 20;
        Integer myInterger3 = Integer.valueOf(20);
        Integer myInterger4 = Integer.parseInt("10");

        int A$B;
        int _hello;
        int False;
       // Error - int false;
       // Error - int java.util;
        int Public;
        // Error - int 19_abc;
        // Error - int 2ACX;

        Integer myInterger5 = null;
        // int myInt2 = null; // cant possible

        System.out.println("myInterger= " + myInterger1);
        System.out.println("myInterger2= " + myInterger2);
        System.out.println("myInterger3= " + myInterger3);
        System.out.println("myInterger4= " + myInterger4);
        System.out.println("myInterger5= " + myInterger5);

        // converting wrapper to primitive -> unboxing
        int myInt2 = myInterger3;
       //  int myInt4 = myInterger5; // Throughs null pointer exception primitive cant handles null

        // Boxing - converting primitive to wrapper
        Integer myInterger6 = 10;
        Integer myInterger7 = myInt;

        printSum(1,5); // Auto Boxing
        printSum(myInterger1,myInterger2); // Not Autoboxing
    }

    private static void printSum(Integer first, Integer second){
        System.out.println("sum = " + (first + second));
    }
}
