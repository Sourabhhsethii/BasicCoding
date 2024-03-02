package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Problem Description
 * Given an array A of non-negative integers, arrange them such that they form the largest number.
 *
 * Note: The result may be very large, so you need to return a string instead of an integer.
 */
public class LargestNumber {

    public static void main(String[] args) {
        System.out.println(largestNumber(new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9))));
    }
    public static String largestNumber(ArrayList<Integer> A) {
        int n = A.size();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = A.get(i);
        }

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String x = a + "" + b;
                String y = b + "" + a;
                return y.compareTo(x);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
        }
        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }

}


