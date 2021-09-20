package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
MergeSort in Asc Order

Input:
         1. The first input is 'n', that is, the number of elements in the array.
         2. In the next line, n elements of the array space-separated.

Output:
The array sorted in decreasing order.

Sample Test Case-1
Sample Input-1:
8
9 45 76 23 47 1 5 11

Output : [1, 5, 9, 11, 23, 45, 47, 76]

 */
public class MergeSortAlgorithmAsc {

    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {

        /**
         * Divide the number array in two half then first and second half recursively and merge the array back again.
         */
        if(first < last){
            int mid =  first + (last - first)/2;
            mergeSort(numbers, first,mid);
            mergeSort(numbers,mid+1,last);
            merge(numbers,first,mid,last);
        }
        return numbers;
    }

    public static void merge(int[] arr, int start, int mid, int last){

        // Find the size of two temp array
        int l1 = mid - start + 1;
        int l2 = last - mid;

        // Create two temp arrays
        int left[] = new int[l1];
        int right[] = new int[l2];

        // Add values in temp arrays
        for (int i=0;i<l1;i++)
            left[i] = arr[start + i];
        for (int j=0;j<l2;j++)
            right[j] = arr[mid +  1 + j];

        // Merge Two temp Arrays

        int i=0,j=0;
        int k = start;

        while (i< l1 && j<l2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaing elements of both array if left.
        while (i<l1){
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j<l2){
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
