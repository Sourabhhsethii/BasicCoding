package com.sorting;

import java.util.Scanner;

/**
 * Sum Closest to Zero
 * You are given an array. The array can contain positive and negative integers. You need to find two elements such that their sum is closest to zero.
 *
 * Apply Half Binary Search Technique.
 *
 * For example, you are given an array {-4, 7, 6, 2, -5}. The two elements with the sum closest to zero will be -5 and 6.
 5
 -4 7 6 2 -5
 * Approach
 *
 * Sort the input array.
 * Initialise a variable ‘l’ as 0. you will use it to traverse from the left side. Also, initialise a variable ‘r’ as n-1, which you will use to traverse from the right side.
 * sum = a[l] + a[r].
 * If sum is -ve, then l++.
 * If sum is +ve, then r--.
 * Keep track of the absolute minimum sum.
 * Repeat steps 3, 4, 5 and 6 while l < r.
 */
public class SumClosestToZero {

    static void sumClosestToZero(int arr[], int n)
    {

        arr = sort(arr);
        int l = 0;
        int r = n-1;
        int sum =0;
        int min_sum = arr[0] + arr[1];
        int min_l =0;
        int min_r=0;

        for(l=0;l<arr.length-1;l++){
            for(r=l+1;r<arr.length;r++){
            sum  = arr[l] + arr[r];
            if(Math.abs(min_sum)>Math.abs(sum)){
                min_sum = sum;
                min_l = l;
                min_r = r;
            }
            }

        }
        System.out.println(arr[min_l] + " "+ arr[min_r]);

    }
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

    public static void main (String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        sumClosestToZero(arr, n);
    }
}
