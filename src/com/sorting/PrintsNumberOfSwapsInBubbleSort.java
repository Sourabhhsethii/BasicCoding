package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
Bubble Sort Code
Description
Write a bubble sort program that prints the number of swaps made after M number of iterations (In this case, ‘M’ should be an input value).

For example, if M = 0, the bubble sort program will perform 0 swaps in 0 iterations.

In bubble sort, an iteration is defined as the total number of times the outer loop runs. Assume that:
1) M <= the array size and
2) the program sorts in descending order.

The code should ask the user to input the values for M, the array size, and finally the elements of the array. So, there will be three types of inputs —

Input 1: The value of M
Input 2: The size of the array
Input 3: The elements inside the array

Sample Input:
2
4
1
2
3
4

Sample Output:
5
 */
public class PrintsNumberOfSwapsInBubbleSort {

    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int var = 0;
        int totalSwaps = 0;
        int tmp =0;
        for (int i=0;i<size;i++){
            // every time will reduce the length by i as last number will already sorted so no need to compare it.
            if(i==M){
                break;
            }
            for (int j=1;j< size - i;j++){
                // Swap Number if and only if adjacent elements are greater, it will provide in accending sorting order.
                if(array[j-1]<array[j]){
                    tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                    totalSwaps = totalSwaps + 1;
                }
            }

        }

        return totalSwaps;
    }

    public static void main(String[] args) {
        int n,m;

        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = input.nextInt();
        }

        System.out.println(totalBubbleSortSwaps(num,m));

    }
}
