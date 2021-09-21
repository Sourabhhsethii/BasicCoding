package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Merge Sort in Dec
 *
 10
 2  4  6  8  10  12  14  16  18  20
 */
public class QuickSortDesc {

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
            if(arr[i]>= pivot){
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
       /* Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        } */

        int[] randomNumbers = {2,  4 , 6  ,8  ,10 , 12  ,14  ,16,  18,  20};
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);

        for (int i=0;i<randomNumbers.length;i++){
            System.out.println(sortedNumbers[i]);
        }
    }
}
