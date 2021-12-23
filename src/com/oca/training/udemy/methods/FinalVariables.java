package com.oca.training.udemy.methods;

import java.util.ArrayList;
import java.util.List;

public class FinalVariables {
    private static final int SIZE = 10;

    private static final List<String> VALUES = new ArrayList<>();
    public static void main(String[] args) {

        int[] myArray = new int[SIZE];
        // SIZE = 11 // Cannot assign a value to final variable 'SIZE'
        // SIZE++;

        int doubleSize = 2 * SIZE; // Can use the final variable

        for (int i=0;i< SIZE;i++){
            System.out.println(myArray[i]);
        }

        VALUES.add("add");
       //  VALUES = new ArrayList<>(); // cant ressign the final object to another refernces.

        System.out.println(VALUES);

        final int myNumber = 10;
        // myNumber = 11; // Cannot assign a value to final variable 'SIZE'

     }
}
