package com.assignment;

import com.oca.training.udemy.test.classes.A;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinusMin {

    public static void main(String[] args) {
        /*ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(solve(arrayList,2));*/
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        arrayList2.add(5);
        arrayList2.add(17);
        arrayList2.add(100);
        arrayList2.add(11);
        System.out.println(solve(arrayList2,1));
    }

    public static int  solve(ArrayList<Integer> A, int B) {


        // Bubble Sorting - Swap Elements
        for (int i=0; i<A.size(); i++)
        {
            for (int j = 0; j < A.size()-i-1; j++)
            {
                if (A.get(i)>A.get(j))
                {
                    Integer tmp = A.get(j);
                    A.set(j,A.get(i));
                    A.set(j,tmp);
                }

            }
        }
        System.out.println(A);

        return A.get(A.size()-B) - A.get(B-1);

    }
}
