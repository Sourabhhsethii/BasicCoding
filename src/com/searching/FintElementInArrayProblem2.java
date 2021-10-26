package com.searching;

import java.util.Scanner;

/**
 * You are given an array of integers that represents the IDs of the users that have registered in “UpgradBook.”
 *
 * The array of integers have the following properties:
 *
 * The array is sorted is an ascending order
 *
 * The array holds distinct integers (i.e. there are no repeating numbers)
 *
 * The array is 1-indexed, i.e. the first element is stored in A[1] (not A[0])
 *
 * However the length of the array, N, is unknown (i.e. you don’t know how long the array is and arrayName.length is not available to you). In short, you can not use the length of the array to apply binary search
 *
 * Since the length of the array is unknown, an error “ArrayIndexOutOfBoundsException” is returned if you try to index into the array with an integer greater than N.
 *
 * Find a function to find positive integer M in the array A and write a program to find M (if M exists) in O(log N) time.
 *
 * If M exists, please print the index of M using System.out.println().
 *
 * If M does not exist, please print the String "NOT_FOUND" using System.out.println().
 * In this part of the problem, we are not supposed to look for A[M]= M
 * We must enter the value we are looking to search for as an input.
 * Also, you are not supposed to use the size of the array to apply binary search. Though you will input the array yourself, and you will be knowing its size , but you can not use the size for applying binary search for Part B of the problem.
 * So, the first input will be the size of the array. Second input will be the key you are looking to search for and at last you input the elements of the array.
 * Input :
 * 10 -  This corresponds to the size of the array.
 * 6 -  This corresponds to the key you are searching for
 * 1 2 3 5 6 7 8 9 10 11 - These are the elements of the array
 * Output :
 * 5 - Output should be the index at which the key is present. In this case, key 6 is present at index 5 of 1-INDEXED array. So the output is 5.
 * Input:
 * 20
 * 20
 * 1 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
 * Output :
 * 19
 *
 *
 *
 * Yes, the program would know the length of the array if the array elements are hard coded. However, this problem attempts to simulate a big data scenario -- a scenario where the number of elements in the array is so big that it won't fit in memory all at once. Therefore, since the Array won't fit in memory, it would be difficult for us to figure out exactly the length of the array.
 * For some real-world motivation to the big data and array is too big to fit in memory scenario, please read about the "Streaming" feature that has been incorporated into Java8
 *
 * For example, imagine that you work at google and you are probably collecting billion of data points about your users and customers per hour and since we haven't taught students about large datasets and streaming, we can't really use those concepts in the com.assignment. Therefore, we want to students to *pretend* that the array is so big that it won't fit in memory and, therefore, there is no way to find the length of the array.
 *
 */
public class FintElementInArrayProblem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfIntegerArray = sc.nextInt();

        int searchNumber = sc.nextInt();

        int[] arr =new int[noOfIntegerArray];
        for (int i=0;i<noOfIntegerArray;i++){
            arr[i] = sc.nextInt();
        }

        int start = 1;
        int end = 2;
        System.out.println(startbinarySearch(arr,searchNumber, start, end));
    }

    public static int startbinarySearch(int[] arr, int searchNumber, int start, int end){
        int searchedNumber = binarySearch(arr,searchNumber,start,end);

        if(searchedNumber == 1){
            searchedNumber = startbinarySearch(arr,searchNumber,start*2, end *2);
        } else
        {
            return searchedNumber;
        }
        return searchedNumber;
    }

    public static int binarySearch(int[] arr, int searchNumber, int start,int end){

        int mid =0;

        while (start <= end){

            mid = (start + end)/2;

            try {

                if (arr[mid] == searchNumber) {
                    return mid + 1;
                } else if (arr[mid] > searchNumber) {
                    end = mid - 1;
                } else if (arr[mid] < searchNumber) {
                    start = mid + 1;
                }
            } catch (ArrayIndexOutOfBoundsException e){
                end = end - 1;
            }
        }

        return 1;

    }
}
