package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * Problem Description
 * You are given an array A of N elements. You have to make all elements unique. To do so, in one step you can increase any number by one.
 *
 * Find the minimum number of steps.
 * Input Format
 * The only argument given is an Array A, having N integers.
 *
 *
 *
 * Output Format
 * Return the minimum number of steps required to make all elements unique.
 */
public class UniqueElements {

    public static void main(String[] args) {
        int[] a = {51,6,10,8,22,61,56,48,88,85,21,98,81,76,71,68,18,6,14,23,72,18,56,30,97,100,81,5,99,2,85,67,46,32,66,51,76,53,36,31,81,56,26,75,69,54,54,54,83,41,
                86,48,7,32,85,23,47,23,18,45,79,95,73,15,55,16,66,73,13,85,14,80,39,92,66,20,22,25,34,14,51,14,17,10,100,35,9,83,31,60,24,37,69,62};
        System.out.println(solve(a));

    }
    public static int solve(int[] A) {
        int[] number = Arrays.stream(A).sorted().toArray();
        int count = 0;

        for(int i =0;i<number.length-1;i++){
            if(number[i] == number[i+1]){
                count++;
                number[i+1] = number[i+1]+1;
            } else if(number[i] > number[i+1]){
                    int diff = (number[i]+1) - number[i+1];
                    count += diff;
                number[i+1] = number[i]+1;

            }
        }
    return count;

    }

}
