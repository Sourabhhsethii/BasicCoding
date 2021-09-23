package com.searching;

import java.util.Scanner;

/**
 * You are given an array of integers that represents the IDs of the users that have registered in “UpgradBook,” a private social network created for all the students who have graduated from Upgrads’ programs.
 *
 * The array of integers has the following properties:
 *
 * With a known length N
 *
 * The array is sorted in an ascending order
 *
 * The array holds distinct integers (i.e. there are no repeating numbers)
 *
 * The array is 1-indexed, i.e. the first element is stored in A[1] (not A[0])
 *
 * Find the first positive integer M (where 1 <= M <= N) such that when M is used as the array index, the result from the array is the the integer M itself. i.e. A[M] = M
 *
 * In other words, find the first positive integer M where M is both a user’s ID and its index in the array of user ids.
 *
 * Write a program to find M, if it exists, in O(log N) time. If M does not exist, please return NOT_FOUND
 * In this part of the problem you are supposed to find an element whose value is equal to its index. The code should print first such instance in the array.
 * Sample Input:
 * 5
 * 0 1 3 4 5
 * Sample Output:
 * 3
 * In this case 5 is the size of the array.
 * 0 1 3 4 5 are the elements of the array where the element 0 is at index 1 and not at index 0. So we effectively do not use the index 0 of the array and start filling the array from index 1 only.
 * Output is 3 because at index 3 the value of the element is 3 only. Though at index 5, the value of the element is also 5 but the code should print first such occurrence.
 * One more test case is given below
 * Input :
 * 7
 * 0 1 2 4 5 6 7
 * Output :
 * 4
 *
 *
 */
public class FindFirstElemnentMatchingIndex {

    public static void main(String[] args) {

        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = input.nextInt();
        }


        if(findMatchingIndex(num) == -1){
            System.out.println("NOT_FOUND");
        } else {
            System.out.println(findMatchingIndex(num));
        }

    }

    public static int findMatchingIndex(int[] num){

        int start = 1;
        int end = num.length-1;

        int mid = 0;

        while (start < end){
            mid = start + (end-start)/2;
            if(num[mid] != mid){
                return num[mid];
            } else if(num[mid] == mid) {
                start = mid + 1;
            }

            if(start     == end){
                return -1;
            }

        }

        return -1;
    }
}
