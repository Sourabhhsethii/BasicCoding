package com.oca.training.udemy.operator;

public class AssignmentOperators {
    public static void main(String[] args) {
        // int x = 1.0; // does not compile
        // short y = 192829;
        // int z = 9f;
        // long t = 312312312331232;

         int x = (int)1.0; // does not compile without casting
         short y = (short)192829; // overflow
         int z = (int)9f;
         long t = (long)312312312331232L;

        System.out.println("x= " + x);
        System.out.println("y= " + y); // overflow
        System.out.println("z= " + z);
        System.out.println("t= " + t);

        // overflow & underflow with byte ( -128 to 128)
        byte myByte = 127;
        byte mySecondByte = -128;

        System.out.println("muByte " +  myByte);
        System.out.println("mySecondByte " +  mySecondByte);

        // myByte = myByte + 1;
        myByte++;

        //mySecondByte = mySecondByte - 1;
        mySecondByte--;
        System.out.println("myByte " + myByte);
        System.out.println("mySecondByte " + mySecondByte);

        short a = 10;
        short b = 20;
        short c = (short)(a *  b);
        System.out.println("c " + c);

    }
}
