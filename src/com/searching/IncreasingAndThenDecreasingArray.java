package com.searching;

import java.util.Scanner;

/**
 * Increasing and Then Decreasing Array
 * You are given an array that is first increasing and then decreasing. You need to find the maximum number in the array.
 *
 * For example, consider the array {1, 2, 4, 7, 10, 9, 5, 3}. The maximum number in the array is 10.
 *
 * Approach
 *
 * The standard binary search algorithm can be modified for this question.
 *
 * If the mid element is greater than both its adjacent elements, then the mid is the maximum.
 * If the mid element is greater than its next element and smaller than the previous element,
 *
 * then the maximum lies on the left side of the mid. Example array: {3, 50, 10, 9, 7, 6}
 9
 8 1 2 4 7 10 9 5 3

 6
 5 22 38 15 8 1
 *
 * If the mid element is smaller than its next element and greater than the previous element
 * , then maximum lies on the right side of the mid. Example array: {2, 4, 6, 8, 10, 3, 1}
 */
public class IncreasingAndThenDecreasingArray {

    static int max(int arr[], int low, int high)
    {
        int mid = 0;
        int max = -1;

        while (low<=high){
            mid = high + (low-mid)/2;

            if( mid<arr.length-1 && mid>0) {
                if (arr[mid] > arr[mid + 1]  && arr[mid] > arr[mid - 1]) {
                    max = arr[mid];
                    break;
                } else if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
                    high = mid - 1;
                } else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                    low = mid + 1;
                }
            }
        }

        return max;
    }

    public static void main (String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(max(arr, 0, n-1));
    }
}
