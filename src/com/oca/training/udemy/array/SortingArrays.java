package com.oca.training.udemy.array;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = {5,10,2};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));



        for(int num:  numbers){
            System.out.print( num + " ");
        }

        System.out.println();

        String[] string = {"50", "9", "500"};
        Arrays.sort(string);
        System.out.println(Arrays.toString(string));
    }
}
