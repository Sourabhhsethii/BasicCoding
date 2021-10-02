package com.searching;

import java.util.Scanner;

/**
 * Find an Element in an Infinite Sorted Array
 * Write the code to find the position of an element in a sorted array of infinite numbers. Since the array is infinite, you cannot know the size of the array.
 *
 * Find an Element in an Infinite Sorted Array
 * Description
 * Problem Statement:
 *
 * Write the code to find the position of an element in a sorted array of infinite numbers. Since the array is infinite, you cannot know the size of the array.
 *
 *
 *
 *
 *
 * Input Format:
 *
 * The input contains a number of elements in the input array followed by array elements, followed by the element to be searched.
 *
 *
 * Output Format:
 *
 * The output contains the position of the element (if the element is found) or -1 (if the element is not found)
 *
 *
 * Sample Test Cases:
 *
 * Input
 *
 * 20 5 10 11 13 17 20 24 34 36 49 52 55 57 61 64 70 71 74 84 93
 *
 * 71
 *
 * Output
 *
 * 16
 *
 * Input
 *
 * 20 1 2 5 9 21 23 25 28 29 31 34 35 46 47 56 65 66 80 88 99
 *
 * 18
 * Output
 * -1
 *
 * Execution Time Limit
 * 5 seconds
 *


 20 1 2 5 9 21 23 25 28 29 31 34 35 46 47 56 65 66 80 88 99

 18

 20 5 10 11 13 17 20 24 34 36 49 52 55 57 61 64 70 71 74 84 93

 71



 */
public class FindAnElementInAnInfiniteSortedArray {

    static int binarySearch(int arr[], int low, int high, int key)
    {
        int mid =0;
        while (low <= high){
            mid = high + (low - high)/2;
            try {
                if (arr[mid] == key) {
                    return mid;
                } else if (arr[mid] > key) {
                    high = mid - 1;
                } else if (arr[mid] < key) {
                    low = mid + 1;
                }
            } catch (ArrayIndexOutOfBoundsException e){
                high = mid - 1;
            }
        }

        return -1;
    }

    static int infiniteArray(int arr[], int key)
    {
        int high = 2;
        int low = 0;


        while (true) {
            try {
                if (key >= arr[high]) {
                    int temp;
                    temp = high;
                    low = temp;
                    high = 2 * temp;
                } else if (key < arr[high]) {
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e){
                break;
            }
        }
        return binarySearch(arr, low, high, key);
    }


    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        int key;
        key = s.nextInt();

        System.out.println(infiniteArray( arr, key ) + "\n" );
    }
}
