package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Sort in Increasing and Decreasing Order
 * Sort in Increasing and Decreasing Order
 * You are given an array of 'n' distinct numbers. You need to sort all the even-placed numbers in increasing order
 * and all the odd-placed numbers in decreasing order. You need to return the even-placed numbers sorted in increasing order first,
 * followed by the odd-placed numbers in decreasing order.
 *
 *
 *
 * Consider the array {6, 7, 3, 8, 5, 4}.
 * Even-placed numbers: 6, 3, 5
 * Odd-placed numbers: 7, 8, 4
 * Even-placed numbers sorted in increasing order: 3, 5, 6
 * Odd-placed numbers sorted in decreasing order: 8, 7, 4
 *
 *
 *
 * Approach
 *
 *
 *
 * Swap odd index positions in the first half of the array, with the even index positions in the second half of the array.
 * Sort the first half of the array in increasing order and the second half of the array in decreasing order.
 *
 *

 Input Format:

 The input contains the number of elements in the array, followed by the elements in the array.

 Output Format:

 The output contains the even-placed numbers sorted in increasing order first, followed by the odd-placed numbers in decreasing order.


 Sample Test Cases:

 Input:

 6 6 7 3 8 5 4

 Output:

 3 5 6 8 7 4


 Input:

 5 5 9 10 7 2

 Output:

 2 5 10 9 7
 */
public class SortInIncreasingAndDecreasingOrder {
    static void sortIncDec(int arr[], int n)
    {
        ArrayList<Integer> evenPostion = new ArrayList();
        ArrayList<Integer> oddPostion = new ArrayList();

        for (int i=0;i<n;i++){
            if(i%2 == 0){
                evenPostion.add(arr[i]);
            } else  {
                oddPostion.add(arr[i]);
            }
        }
        evenPostion.sort((a, b) -> Integer.compare(a, b));
        oddPostion.sort((a, b) -> Integer.compare(b, a));

        for (int i=0;i<evenPostion.size();i++){
            System.out.print(evenPostion.get(i) + " ");
        }
        for (int i=0;i<oddPostion.size();i++){
            System.out.print(oddPostion.get(i) + " ");
        }

    }



    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        sortIncDec(arr, n);

    }
}
