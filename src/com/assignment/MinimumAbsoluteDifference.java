package com.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem Description
 * Given an array of integers A, find and return the minimum value of | A [ i ] - A [ j ] | where i != j and |x| denotes the absolute value of x.
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 3, 4, 5]
 * Input 2:
 *
 *  A = [5, 17, 100, 11]
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  6
 */
public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
        List<Integer> arrlist =  List.of(37,19,71,72,5,4,74,2,30,33,85,1,7,14,98,27,51,7,24,88,86,81,77,64,13,3,63,75,29,50,90,3,22,94,40,72,75,26,32,64,62,59,19,16);

        int[] arr = new int[arrlist.size()];

        // ArrayList to Array Conversion
        for (int i = 0; i < arrlist.size(); i++)
            arr[i] = arrlist.get(i);
        System.out.println(solve(arr));
        System.out.println(solve2(arr));
    }

    /**
     * O(N*N) Solutions !!
     * @param A
     * @return
     */
    public static int solve(int[] A) {
        int min = Integer.MAX_VALUE;
        int n = A.length;
        // ALL Sub Array // Iterate on lower trinagle
        for(int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){
                // All index of subarrays!!!!
                int sub = Math.abs(A[i] - A[j]);
                if(min > sub){
                    min = sub;
                }
            }
        }
        return min;
    }

    /**
     * O(nlogn) Solution -> Soring + Iterating => (nlogn) + (n)
     * @param A
     * @return
     */
    public static int solve2(int[] A) {
        Arrays.sort(A);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < A.length-1; i++) {
            int dif = Math.abs(A[i]-A[i+1]);
            if(minDiff>dif){
                minDiff = dif ;
            }
        }
        return minDiff;
    }
}
