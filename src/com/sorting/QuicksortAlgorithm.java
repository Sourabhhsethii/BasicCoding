package com.sorting;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Quick Sort Algorithm
 * Quick Sort
 * Description
 * Write a program in Java that takes an array of strings as input and returns the sorted array. Assume that the sorting needs to be done based on the size of each string. So, a string with fewer characters should come before another string with more number of characters. Use the quicksort algorithm for the program.
 *
 * Sample Input - 1:
 * 7
 * Christene
 * Tomas
 * Marline
 * Marcelluss
 * Michelle
 * Quiana
 * Keny
 *
 * Sample Output - 1:
 * Keny
 * Tomas
 * Quiana
 * Marline
 * Michelle
 * Christene
 * Marcelluss
 *
 * So, the first input is the number of elements in the array. In this case, the number of elements is 7. Next 7 inputs are the elements inside the array. As you can see in the output, the names are sorted as per their length. The name with fewer characters comes before the names with more characters.
 *
 * Sample Input - 1:
 * 3
 * Cat
 * Tree
 * Bag
 *
 * Sample Output - 2:
 * Cat
 * Bag
 * Tree
 *
 * So, the first input is the number of elements in the array. In this case, the number of elements is 3. Next 3 inputs are the elements inside the array. As you can see in the output, the names are sorted as per their length.
 *
 * Please note that Quick Sort is an unstable sorting algorithm. So, the words with same number of characters may come in a different sequence for different people depending upon the factors outside our control.
 */
public class QuicksortAlgorithm {

    public static int partition(String arr[], int start, int end) {

        int pivot = arr[end].length();
        int p = start;

        for (int i = start; i < end; i++) {
            if (arr[i].length() <= pivot) {
                String  temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                p++;
            }
        }
        String temp = arr[p];
        arr[p] = arr[end];
        arr[end] = temp;

        return p;
    }


    public static void quickSort(String array[], int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] randomNumbers = new String[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.next();
        }

        quickSort(randomNumbers,0,randomNumbers.length-1);

        for (int i =0;i<randomNumbers.length;i++){
            System.out.println(randomNumbers[i]);
        }
    }

}
