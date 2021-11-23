package com.assignment;

import java.net.PortUnreachableException;
import java.util.Scanner;

/**
 * Suppose you rotate an array of integers that is sorted in increasing order, at an unknown pivot. Check whether the given key is present in the array or not.
 * Construct a way to find an element in the given array in O(log n) time, where n is the number of elements in the array.
 *
 * Search Element in a Rotated Array
 * Description
 * Suppose you rotate an array of integers that is sorted in increasing order, at an unknown pivot. Check whether the given key is present in the array or not. Construct a way to find an element in the given array in O(log n) time, where n is the number of elements in the array.
 *
 * For example, 14 15 16 17 18 19 11 12 13 is an array that is sorted in increasing order and rotated at 11.
 *
 *
 *
 *
 *
 * Input Format:
 *
 * The first line contains an integer N as the size of the array.
 *
 * The second line contains elements of the array.
 *
 * The third line contains the key to be searched in the given array.
 *
 *
 *
 * Output Format:
 *
 * Print the index of an array if the key is found in the array, else print -1.
 *
 *
 *
 * Sample Test Cases:
 *
 * Input:
 *
 * 9
 *
 * 14 15 16 17 18 19 11 12 13
 *
 * 6
 *
 *
 *
 * Output:
 *
 * -1
 *
 *
 *
 *
 *
 * Input:
 *
 * 9
 *
 * 14 15 16 17 18 19 11 12 13
 *
 * 11
 *
 *
 *
 * Output:
 *
 * 6
 * Note that you need to print the index of the key if it is found in the array, else print -1.
 */
public class SearchElementInARotatedArray {
    public static int search(int arr[], int n, int key) {
        int pivot = pivotElement(arr, 0, n - 1);
        if (pivot == -1)
            return binarySearch(arr, 0, n - 1, key);
        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return binarySearch(arr, 0, pivot - 1, key);
        return binarySearch(arr, pivot + 1, n - 1, key);

    }

    public static int pivotElement(int arr[], int low, int high){
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return pivotElement(arr, low, mid - 1);
        return pivotElement(arr, mid + 1, high);
    }

    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int i = search(arr, arr.length,key);
        if (i != -1) {
            System.out.println(i);
        } else {
            System.out.println("-1");
        }
    }
}
