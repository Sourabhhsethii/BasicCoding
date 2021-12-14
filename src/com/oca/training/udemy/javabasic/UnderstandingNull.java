package com.oca.training.udemy.javabasic;

public class UnderstandingNull {
    static Object myObject = new Object();
    static Object myAnotherObject;
    static String myString;


    public static void main(String[] args) {
    Object myLoaclObject = new Object();
    Object anotherLocalObject;

    String name = "Java";
    String anotherName = null;

        System.out.println("myObject= " + myObject);
        System.out.println("myAnotherObject= " + myAnotherObject);

        System.out.println("myLoaclObject= " + myLoaclObject);
        // System.out.println("anotherLocalObject= " + anotherLocalObject);
        System.out.println("name = " + name);
        System.out.println("anotherName = " + anotherName);

        myString = "JAVA";

        System.out.println("myString = " + myString);
        myString = myString.toLowerCase();
        System.out.println("anotherName = " + myString);

    }
}
