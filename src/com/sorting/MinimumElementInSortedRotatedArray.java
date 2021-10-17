package com.sorting;

import java.util.Scanner;

/**
 * You are given a sorted array of 'n' elements. The array has been rotated on an unknown pivot. You need to find the minimum element in the array.
 * Approach
 *
 *
 *
 * You can solve this using binary search. The minimum element is the only element whose previous element is greater than it. If there is no previous element, then there is no rotation (the first element is the minimum). You check this condition for the middle element by comparing it with the (mid-1)
 * t
 * h
 *  and (mid+1)
 * t
 * h
 *  elements.
 *
 *
 * If the minimum element is not at the middle (neither mid nor mid+1), then the minimum element lies in either the left half or the right half.
 *
 * If the middle element is smaller than the last element, then the minimum element lies in the left half.
 * Else, the minimum element lies in the right half.
 *
 * Description
 * You are given a sorted array of 'n' elements. The array has been rotated at an unknown pivot. You need to find the minimum element in the array.
 *
 *
 *
 * Input Format:
 *
 * The input contains the number of elements in the array, followed by the elements in the array.
 *
 *
 *
 * Output Format:
 *
 * The output contains the minimum element in the array.
 *
 *
 *
 * Sample Test Cases:
 *
 * Input:
 *
 * 6 3 4 5 6 1 2
 *
 *
 *
 * Output:
 *
 * 1
 *
 * Input:
 *
 * 5 8 8 9 3 4
 *
 * Output:
 *
 * 3
 */
public class MinimumElementInSortedRotatedArray {

    public static int minimum(int arr[], int low, int high)
    {
        if(high<low){
            return arr[0];
        }

        if(high == low){
        return arr[low];
        }
        int mid = low +  (high - high)/2;

        if(mid<high && arr[mid+1]<arr[mid]){
            return arr[mid+1];
        }

        if(mid>low && arr[mid]<arr[mid-1]){
            return arr[mid];
        }

        if(arr[high]> arr[mid]){
            return minimum(arr,low,mid-1);
        }
        return minimum(arr,mid+1,high);
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(minimum(arr, 0, n-1));
    }
}
