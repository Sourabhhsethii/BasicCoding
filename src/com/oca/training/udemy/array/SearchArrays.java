package com.oca.training.udemy.array;

import java.util.Arrays;

public class SearchArrays {
    public static void main(String[] args) {
        int[] number = {1,2,3,7};
        System.out.println(Arrays.binarySearch(number,2));
        System.out.println(Arrays.binarySearch(number,5));
        System.out.println(Arrays.binarySearch(number,7));
        System.out.println(Arrays.binarySearch(number,1));
        System.out.println(Arrays.binarySearch(number,3));
        System.out.println(Arrays.binarySearch(number,6));
        System.out.println(Arrays.binarySearch(number,4));

        System.out.println("Unsoredt Array");

        int[] notSortedNumber = {5,4,10,8,6};
        System.out.println(Arrays.toString(notSortedNumber));
       // Arrays.sort(notSortedNumber);
        System.out.println(Arrays.binarySearch(notSortedNumber,5));
        System.out.println(Arrays.binarySearch(notSortedNumber,8));
    }
}
