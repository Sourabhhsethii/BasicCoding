package com.sorting.algo;

import java.util.Arrays;

public class SortSubArray {
    public static void main(String[] args) {

        int[] arr = new int[] {8,1,3,6,11,2,4,9,7};
        Arrays.stream(sortSubArrays(arr,2,5,8)).forEach(x-> System.out.print(" " +  x));

    }

    static int[] sortSubArrays(int[] arr, int l, int y, int r){

        int[]  temp = new int[r-l+1];
        int a = l;
        int b = y;
        int c = 0;

        while (a<y && b<=r) {
            if(arr[a]<arr[b]) {
                temp[c] = arr[a];
                c++;
                a++;
            } else {
                temp[c] = arr[b];
                c++;
                b++;
            }
        }

        while (a<y) {
            temp[c] = arr[a];
            c++;
            a++;
        }

        while (b<=r) {
            temp[c] = arr[b];
            c++;
            b++;
        }

        return temp;
    }


}
