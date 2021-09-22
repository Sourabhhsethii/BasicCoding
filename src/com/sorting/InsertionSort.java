package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
Insertion Sort

Inputs
6
1
7
2
6
3
5

Output: [1, 2, 3, 5, 6, 7]
 */
public class InsertionSort {

    public static void insertionSort(int[] arr){
        int temp =0;
        int count = 0;
        // iteration from second element in an array till last
        for (int i=1;i<arr.length;i++){ // Correct
            // Move towards left of selected i element

            int v= arr[i];
            int j=i;

            while (j>=1 && arr[j-1]>v){
                arr[j] = arr[j-1];
                j--;

            }
            arr[j]=v;

        }
        System.out.println( "Count:  " +count);
        System.out.println(Arrays.toString(arr));

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
        insertionSort(num);

    }
}
