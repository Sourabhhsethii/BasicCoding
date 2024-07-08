package com.sorting.algo;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println();
        bubbleSort(new int[] {5,6,8,1,2,3});
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i <  arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j] < arr[i]) {

                    // Swap(i,minIndex)
                    int temp  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;   }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]  + " ");
        }

    }
}
