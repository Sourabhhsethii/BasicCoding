package com.sorting.algo;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int [] arr = new int[] {3,68,1,3,7,3,1};
        Arrays.stream(sort(arr)).forEach(x -> System.out.print(" " + x));
    }

    static int[] sort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int j = i-1;

            while (j>=0 && arr[j] > arr[j+1] ){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
        return arr;
    }

}


