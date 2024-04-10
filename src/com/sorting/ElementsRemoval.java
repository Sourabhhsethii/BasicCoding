package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem Description
 * Given an integer array A of size N. You can remove any element from the array in one operation.
 * The cost of this operation is the sum of all elements in the array present before this operation.
 *
 * Find the minimum cost to remove all elements from the array.
 */
public class ElementsRemoval {
    public static void main(String[] args) {

        ArrayList<Integer> testCase = new ArrayList();
        testCase.add(2);
        testCase.add(1);
        System.out.println(solve(testCase));

    }


    public static int solve(ArrayList<Integer> A) {

        Collections.sort(A);
        Collections.reverse(A);
        int sum =0;
        for(int i=0;i<A.size();i++) {
            sum = sum + (A.get(i) * (i+1));
        }
        return sum;
    }

}
