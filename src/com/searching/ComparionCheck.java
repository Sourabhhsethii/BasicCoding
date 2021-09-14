package com.searching;

import java.util.Scanner;

/**
 * Check If for no of comparion in binary search;
 */
public class ComparionCheck {

    public static int binarySearch(int[] arr, int searchNumber){

        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        int count = 0;

        while (left <= right){
            mid = right + (left - right)/2;
            if(arr[mid] == searchNumber){
                count = count +1 ;
                break;
            } else if(arr[mid]> searchNumber) {
                count = count +1 ;
                right = mid -1;
            } else {
                count = count +1 ;
                left = mid +1;
            }
        }

        return count-1;
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
