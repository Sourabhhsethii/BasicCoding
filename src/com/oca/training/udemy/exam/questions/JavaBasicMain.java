package com.oca.training.udemy.exam.questions;

public class JavaBasicMain {
    public static void main(String[] args) {


        // Java Basics


        // Q1 Choose Valid Identifiers
        int A$B; // Valid
        int _hello; // Valid
       // int false; // Invalid
       // int java.util // Invalid
        int Public; // Valid
        // int 19_abs; // Invalid
        int $AB$;

        // Q2 Valid Statements
        short mypets = 5;
        //int myNumber = 5; // Invalid
        String theString = "Scuff";
       // mypets.length(); // Invalid
       // myNumber.lenght(); // Invalid
        theString.length(); // length is function in Object such as string

        int[] abc = {1,2};
        int a = abc.length; // length is staic member to get lenght on an array.

    }
}


// Q3 - Find Out the correct Output.
class WaterTank{
    private  String brand;
    private  boolean empty;

    // Q4 - Correct Entry Point - As well syntax
    public static void main(String[] args) {
        WaterTank wb = new WaterTank();
        System.out.print("Empty= "+ wb.empty);
        System.out.print(", Brand= "+ wb.brand);

        double amount = 1_2.0_0;
        System.out.println(amount);
    }
}
