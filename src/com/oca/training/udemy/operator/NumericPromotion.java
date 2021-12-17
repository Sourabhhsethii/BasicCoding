package com.oca.training.udemy.operator;

public class NumericPromotion {
    public static void main(String[] args) {
       // promotion is converting "smaller" into "bigger" type
        int x = 5;
        double y = 10.55;
        System.out.println("x + y = " + (x+y) );

        double result = x + y;
        System.out.println("x + y = " +result);

        byte b = 10;
        int c = 4;
        double d = 4.5;

        double result2 = b + c + d;
        System.out.println("result  = "+ result2);

        // Casting is converting "bigger" type to "smaller" type

        double myDouble = 5.55;
        int myInt = 4 + (int)myDouble;
        System.out.println("result + " + myInt);

        int anotherInt = 125;
        byte myByte  = 15;
        int intResult = anotherInt + myByte;
        byte byteResult = (byte) (anotherInt + myByte);
        System.out.println("intResult = " + intResult);
        System.out.println("byteResult = " + byteResult); // overflow -> will lose prescion

        short a = 14;
        float f = 13f;
        double z = 30;
        System.out.println("result short " + a*f/z);

    }
}
