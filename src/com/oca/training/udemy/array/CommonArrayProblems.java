package com.oca.training.udemy.array;

public class CommonArrayProblems {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5}; // 5 elements, index range 0-4
        for (int i=1;i<number.length;i++){
            System.out.println(i + " - " + number[i]);
        }

        System.out.println();

        for (int i=1;i<=number.length-1;i++){
            System.out.println(i + " - " + number[i]);
        }

        int[] nums = new int[4]; // size ony at initialization
        //int size = number.length(); // Errpr - length is not a function.
        int size = number.length;

       // number.length = 10; // Error cant change as lenght of the array is final varibale, it can only with intrialize.

    }
}
