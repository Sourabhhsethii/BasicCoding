package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Merge Sorted Arrays
 * Description
 * Write a function that merges two sorted arrays in descending order.
 *
 *
 *
 * Input Format:
 *
 * Size of first sorted array
 * Elements of first sorted array
 * Size of second sorted array
 * Elements of second sorted array
 * Output Format:
 *
 * Print the merged sorted array in descending order
 *
 *
 * Sample Input 1:
 *
 * 3
 *
 * 1 2 3
 *
 * 4
 *
 * 4 5 6 7
 *
 * Sample Output 1:
 *
 * 7
 *
 * 6
 *
 * 5
 *
 * 4
 *
 * 3
 *
 * 2
 *
 * 1
 *
 * Explanation 1:
 *
 * So the first input, 3, corresponds to the size of the first sorted array. The next 3 inputs i.e. 1,2 and 3 are the elements inside the first sorted array.
 *
 *
 *
 * Similarly the third line represents the size of the second array which in this case is 4 and the next 4 elements i.e. 4,5,6 and 7 correspond to the second sorted array.
 *
 *
 *
 * When we merge the two arrays to form a sorted array we get: 1 2 3 4 5 6 7
 *
 * So, the descending ordered array would be: 7 6 5 4 3 2 1
 */
public class MergeSortedArrays {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }

        int descendingMerge[]= mergeBothInDescendingOrder(array1, array2);

        for (int i=0;i<descendingMerge.length;i++){
            System.out.println(descendingMerge[i]);
        }



    }
     public static int[] mergeBothInDescendingOrder(int[] array1, int[] array2){
        int size = array1.length + array2.length;
        int[] mergerArray = new int[size];
         int i =0;
        for (i=0;i<array1.length;i++){
            mergerArray[i] = array1[i];
        }

        for(int j=0;j<array2.length;j++){
            mergerArray[i] = array2[j];
            i++;
        }

        return sort(mergerArray);
     }

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

            /**
             * Important
             * For DEC Order Greater Then check has to be added.
             */
            if(left[i] >= right[j]){
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

}
