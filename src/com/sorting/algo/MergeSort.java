package com.sorting.algo;

import java.util.Arrays;

/**
 * Merge Sort
 * TC -> O(nlogn)
 * Not Stable
 * In-Place
 * No Swaps
 * No Of comparison ->
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[] {4,5,3,1,3};
        Arrays.stream(mergeSort(arr,0,arr.length-1)).forEach(x-> System.out.print(" " + x));

    }

    static int[] mergeSort(int[] arr, int left, int right) {

        // Base Condition
        if(left == right)
            return arr;

        int mid =  (left + right)/2;

         mergeSort(arr,left,mid);
         mergeSort(arr,mid+1,right);
        return mergeSubArray(arr,left,mid+1,right);

    }

    static int[] mergeSubArray(int arr[], int l, int mid , int r) {

        // l, mid,r
        int a = l;
        int b = mid;
        int c = 0; // counter for new array...
        int temp[] = new int[r-l+1];

        while(a<mid && b <=r) {

            if(arr[a]< arr[b]){
                temp[c] = arr[a];
                a++;
                c++;
            } else {
                temp[c] = arr[b];
                b++;
                c++;
            }
        }

        while (a<mid){
            temp[c] = arr[a];
            c++;
            a++;
        }

        while (b<=r){
            temp[c] = arr[b];
            c++;
            b++;
        }

        return temp;

    }

}
