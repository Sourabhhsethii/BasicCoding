package com.oca.training.udemy.exception;

public class UnderstandingExceptions {
    public static void main(String[] args) {
        try {
            int[] myArray = new int[2];
            System.out.println(myArray[5]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
         }
}
