package com.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArithmeticProgression {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(solve(list));

    }

    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i= A.size()-1;i>1;i++){
            int diff1 = A.get(i) - A.get(i-1);
            int diff2 = A.get(i-1)- A.get(i-2);
            if(diff1 !=diff2){
                return 0;
            }
        }
        return 1;
    }
}
