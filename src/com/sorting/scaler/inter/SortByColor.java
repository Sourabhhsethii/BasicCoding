package com.sorting.scaler.inter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Problem Description
 *
 * Given an array with n objects colored red, white or blue, sort them so that objects of the
 * same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * Note: Using library sort function is not allowed.
 *
 * 0 1 2 0 1 2
 */
public class SortByColor {

    public static void main(String[] args) {
        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int length;

        ArrayList<Integer> list = new ArrayList<>();
        length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Approach 1--> " + sortColors(list));
    }


    // T.C -> O(N^2)
    public static ArrayList<Integer>  sortColors(ArrayList<Integer> A) {

        for (int i=0;i<A.size();i++){
            for (int j=i+1;j<=A.size()-1;j++){
                if(A.get(i)>A.get(j)){
                    Integer temp = A.get(i);
                    A.set(i,A.get(j));
                    A.set(j,temp);
                }
            }
        }
        return A;
    }
}
