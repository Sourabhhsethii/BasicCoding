package com.sorting.algo;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Arrays.stream(mergeTwoSortedArray(new int[]{1, 5, 9}, new int[]{2, 4, 6})).forEach(x-> System.out.print( " "+ x));
    }


    static int[] mergeTwoSortedArray(int left[], int right[]) {

        int[] temp =new int[right.length + left.length];

        int n = left.length;
        int m = right.length;
        int c = n+m;

        int i =0;
        int j =0;
        int k =0;

        while (i<n && j<m){
            if(left[i]< right[j]){
                temp[k] = left[i];
                i++;
                k++;
            } else {
                temp[k] = right[j];
                j++;
                k++;
            }
        }

        while (i<n){
            temp[k] =  left[i];
            i++;
            k++;
        }

        while (j<m){
            temp[k] =  left[j];
            j++;
            k++;
        }

        return temp;

    }
}
