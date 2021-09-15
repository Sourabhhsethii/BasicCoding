package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Selection Sort
 */
public class SelectionSort {

    static void selectionSort(int[] num){

        // Loop to iterate over array as well start from i=0 till i=n-1 -> check till n-2
        for (int i=0;i<num.length-1;i++){
            // min == i in first iteration & will swap the min with minimum element in an array.
            int min = i;
            // Loop to iterate over array as well start from j=i+1 till i=n (last element). check till n-1
            for (int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                min = j;
                }
            }

            // Values are getting swaped
                int temp = num[min];
                num[min] = num[i];
                num[i] = temp;

        }

        System.out.println(Arrays.toString(num));

    }

    public static void main(String[] args) {
        int n;

        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = input.nextInt();
        }
        selectionSort(num);

    }

}
