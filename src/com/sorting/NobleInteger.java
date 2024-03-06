package com.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Description
 * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p
 * Input Format
 * First and only argument is an integer array A.
 *
 *
 *
 * Output Format
 * Return 1 if any such integer p is present else, return -1.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [3, 2, 1, 3]
 * Input 2:
 *
 *  A = [1, 1, 3, 3]
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  -1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  For integer 2, there are 2 greater elements in the array..
 * Explanation 2:
 *
 *  There exist no integer satisfying the required conditions.
 */
public class NobleInteger {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(List.of(6,7,5))));


    }

    public static int solve(ArrayList<Integer> list) {
        list.sort(Integer::compareTo);
        int size = list.size();
        for(int i=0;i<size;i++) {
            while(i+1<size && list.get(i)== list.get(i+1))
                i++;
            if(list.get(i) == size-i-1)
                return 1;
        }
        return -1;
    }
}
