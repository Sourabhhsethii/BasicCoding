package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
Quick Sort in asc order

Input : 5
        2 5 6 1 3
Output : [1, 2, 3, 5, 6]

 */
public class QuickSort {

    public static int[] sort(int[] arr){
        return sortQuickSort(arr,0,arr.length-1);
    }

    public static int[] sortQuickSort(int[] arr, int start, int end){
        if(start<end){
            int p  = partition(arr,start,end);
            sortQuickSort(arr,0,p-1);
            sortQuickSort(arr,p+1,end);
        }
        return arr;
    }

    public static int partition(int arr[], int start, int end){

        int pivot = arr[end];
        int p = start;

        for (int i=start;i<end;i++){
            if(arr[i]<= pivot){
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                p++;
            }
        }
        int temp = arr[p];
        arr[p] = arr[end];
        arr[end] =temp;

        return p;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
