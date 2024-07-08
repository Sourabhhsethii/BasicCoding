package com.sorting.algo;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        selectionSort(new int[] {5,6,8,1,2,3});
        System.out.println();
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i <  arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length ; j++) {
                if(arr[j] < min) {
                    // Swap
                    min =  arr[j];
                    minIndex = j;
                }
            }
            // Swap(i,minIndex)
            int temp  = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]  + " ");
        }

    }
}
