package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumAbsoluteDifference {
    public static void main(String[] args) {
        System.out.println(maxArr(List.of(1,3,-1)));
    }

    static  public int maxArr(List<Integer> A) {

        int max = Integer.MIN_VALUE;
        int n = A.size();
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                int cal = calculateValue(A.get(i),A.get(j),i+1,j+1);
                max= Math.max(max,cal);
            }
        }

        return max;
    }

    static int calculateValue(int a, int b, int i, int j) {
        return Math.abs(a-b) + Math.abs(i-j);
    }
}
