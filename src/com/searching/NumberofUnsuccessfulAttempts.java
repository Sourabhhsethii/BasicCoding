package com.searching;

import java.util.Scanner;

public class NumberofUnsuccessfulAttempts {

    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        return -1;
    }
    public static void main(String args[] ) throws Exception {
        NumberofUnsuccessfulAttempts bs = new NumberofUnsuccessfulAttempts();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}
