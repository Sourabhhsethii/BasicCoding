package com.hashset;

import java.util.*;

/**
 * Remove Duplicates from the Array

 * You will be given an array of n natural numbers containing duplicates. You need to find the duplicate numbers and remove it from the array and print the elements of an array containing all the unique elements.
 *

 * Example:
 *
 * If you have elements 1,5,6,1,3,7,5,1,6,8,3 in the given array then after performing some operations your array will look like - 1,5,6,3,7

 *
 * Ideas for Solution:
 *
 * You can take help of sets as they don’t allow duplicates.
 */
public class RemoveDuplicatesFromTheArray {

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);

        // number of the elements
        int n = in.nextInt();
        int array[] = new int[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }
        Set<Integer> hs = new LinkedHashSet<>();

        for(int i =0;i<n;i++){
            hs.add(array[i]);
        }
        System.out.println(hs);
    }
}
