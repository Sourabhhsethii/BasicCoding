package com.sorting;

import java.util.Scanner;

/**
 * Union and Intersection of Two Unsorted Arrays
 *
 * ou are given two unsorted arrays. The elements in each array are distinct. Determine the union and intersection of the two arrays.
 *
 *
 *
 * Approach
 *
 *
 *
 * Union:
 *
 *
 *
 * Initialise union U as empty.
 * Find the smaller of m and n and sort the smaller array.
 * Copy the smaller array to U.
 * For every element x of the larger array, do the following:
 * Binary search x in the smaller array. If x is not present, then copy it to U.
 * Return U.
 *
 *
 *
 * Intersection:
 *
 *
 * Initialise intersection I as empty.
 * Find the smaller of m and n and sort the smaller array.
 * For every element x of the larger array, do the following:
 * Binary search x in the smaller array. If x is present, then copy it to I.
 * Return I.
 *
 * Union and Intersection of two Unsorted Arrays
 * Description
 * You are given two unsorted arrays. Elements in each array are distinct. Determine the union and intersection of the two arrays.
 *
 *
 *
 * Input Format:
 *
 * The first line of the input contains the number of elements in the first array, followed by the elements in the first array. The second line of the input contains the number of elements in the second array, followed by the elements in the second array
 *
 *
 *
 * Output Format:
 *
 * The first line of the output contains the union of the two arrays. The second line of the output contains the intersection of the two arrays.
 *
 *
 *
 * Sample Test Cases:
 *
 * Input:
 *
 * 6 5 7 8 6 4 2
 *
 * 5 3 2 4 9 8
 *
 *
 *
 * Output:
 *
 * 2 3 4 8 9 5 7 6
 *
 * 8 4 2
 *
 * Execution Time Limit
 * 5 seconds
 */
public class UnionAndIntersectionOfTwoUnsortedArrays {
    static void union(int arr1[], int arr2[], int m, int n)
    {
        //Write code here
    }

    static void intersection(int arr1[], int arr2[], int m, int n)
    {
        //Write code here
    }

    public static void main(String[] args)
    {
        int m;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        int arr1[] = new int[m];
        for(int i = 0; i < m; i++)
            arr1[i] = s.nextInt();

        int n;
        n = s.nextInt();
        int arr2[] = new int[n];
        for(int i = 0; i < n; i++)
            arr2[i] = s.nextInt();

        union(arr1, arr2, m, n);
        System.out.print("\n");
        intersection(arr1, arr2, m, n);
    }
}
