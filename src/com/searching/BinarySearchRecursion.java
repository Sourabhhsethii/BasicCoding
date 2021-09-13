package com.searching;

import java.util.Scanner;

/**
 * Do Binary Search with Recursion
 */
public class BinarySearchRecursion {

    public  static void binarySearch(int arr[], int searchNumber, int left, int right){

        // Base Condition - stop recursion when left index is greater then right index as that means number not found.
        if(left>right){
            System.out.println("Number : "+ searchNumber +" can't be found in the array");
            return;
        }

        //work;
        int mid = left + (right -left)/2;
        if(arr[mid] == searchNumber){
            System.out.println(" Number Found " + arr[mid] + " at " + mid + " index");
        } else if(arr[mid]> searchNumber) {
            right = arr[mid]-1;
            binarySearch(arr,searchNumber,left,right);
        } else {
            left = arr[mid]+1;
            binarySearch(arr,searchNumber,left,right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfIntegerArray = sc.nextInt();
        int[] arr =new int[noOfIntegerArray];
        for (int i=0;i<noOfIntegerArray;i++){
            arr[i] = sc.nextInt();
        }
        int searchNumber = sc.nextInt();
        binarySearch(arr,searchNumber,0,arr.length-1);
    }
}
