package com.recursion.example.sep21;

import java.util.Arrays;
import java.util.Scanner;

/*
You are given an array of 'n' integers. The integers in the array are between 1 and n-1. You need to find the duplicate.
You need to do it in O(n) time, but you can use extra space.
 */
public class DuplicateInAnArray {

    static int duplicate(int arr[], int n)
    {
        int[] count = new int[n];

        for (int i=0;i<n;i++){
          count[i] = 0;
        }

        if(arr.length == 1  ){
            return -1;
        }

        count = count(arr,n,count);


        int number = -1;
        for (int i=0;i<count.length;i++){
            if (count[i] >= 2){
                number = i;
                break;
            }
        }


        return number;
    }

    static int[] count(int arr[], int n, int[] count){
        // Base Condition
        if(n == 0){
            return count;
        }
        count[arr[n-1]] = count[arr[n-1]] + 1;
        count(arr,n-1, count);
        return count;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(duplicate(arr, n));
    }
}
