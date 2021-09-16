package com.sorting;

import java.util.Scanner;

/**
 * Insertion Sort Code
 * Description
 * Write a program in Java that can return an array in descending order of elements using insertion sort.
 * The program will take the size of the array and the elements of the array as inputs.
 *
 * Sample Input:
  4
  1
  2
  3
  4
 *
 * Sample Output:
 * 4
 * 3
 * 2
 *
 *
 */
public class DescendingOrderInsertionSort {

    public static void insertionSort(int[] num){

        for (int i=0;i<num.length;i++){
            int j = i;
            int value = num[i];

            while (j>=1 && num[j-1]<value){
                num[j] = num[j-1];
                j--;
            }
            num[j] = value;
        }
        for (int i=0;i<num.length;i++){

            System.out.println(num[i]);
        }

    }

    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = input.nextInt();
        }
        insertionSort(num);

    }
}
