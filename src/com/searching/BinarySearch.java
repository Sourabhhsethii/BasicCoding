package com.searching;

import java.util.Scanner;

/*
Binary Search - O(log n)
It Reduces the search space by n/2 in every step.
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int searchNumber){

        int left = 0;
        int right = arr.length-1;
        int mid = 0;

        while (left <= right){
            mid = (left + right)/2;
            if(arr[mid] == searchNumber){
                return 1;
            } else if(arr[mid] > searchNumber) {
                right = mid -1;
            } else if(arr[mid] < searchNumber)  {
                left = mid + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfIntegerArray = sc.nextInt();
        int[] arr =new int[noOfIntegerArray];
        for (int i=0;i<noOfIntegerArray;i++){
            arr[i] = sc.nextInt();
        }
        int searchNumber = sc.nextInt();
        System.out.println(binarySearch(arr,searchNumber));
    }
}
