package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 Bubble Sort
 */
public class BubbleSort {


    public static int[] bubbleSort(int[] arr){
        int temp = 0;


        for (int i=0;i<arr.length;i++){
            // every time will reduce the length by
            for (int j=1;j< arr.length - i;j++){
                // Swap Number if and only if adjacent elements are greater, it will provide in accending sorting order.
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr) + "");
                }
            }

        }
        return arr;
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
        bubbleSort(num);

    }
}
