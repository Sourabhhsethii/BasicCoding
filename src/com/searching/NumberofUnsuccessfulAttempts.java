package com.searching;

import java.util.Scanner;

/**
 *Number of Unsuccessful Attempts
 * Description
 * Write a code that returns the number of unsuccessful attempts made to search for an element in the array using Binary search.
 * The code should
 * Take the size of the array as an input from the user
 * The elements of the array as an input from the user
 * The key you are searching for as an input from the user
 *
 * Sample Input:
 * 5
 * 2 3 4 5 8
 * 8
 *
 * Sample Output:
 * 2
 *
 * So in this sample test case, the first input is the size of the array i.e the array has 5 elements. Next 5 inputs are the elements inside the array. The last input i.e. 8 is the key the code should search for. Since in this case, it will take 2 unsuccessful steps for the code to reach 8, so the output is 2.
 *
 * Hint: To calculate the middle index use the recommended formula instead of using the formula used in pseudocode.
 */
public class NumberofUnsuccessfulAttempts {

    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {

        int low = 0;
        int high = inputArr.length -1 ;
        int mid = 0;
        int index = Integer.MAX_VALUE;
        int count = 0;

        while (low <= high){
            count++;
            mid = low + (high-low)/2;
            if(inputArr[mid] == key){
                count = count - 1;
                break;
            } else if(inputArr[mid]> key) {
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return count;
    }
    public static void main(String args[] ) throws Exception {
        NumberofUnsuccessfulAttempts bs = new NumberofUnsuccessfulAttempts();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}
