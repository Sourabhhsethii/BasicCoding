package com.hashmap;

import com.oca.training.udemy.test.classes.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Description
 * Given an array A of N integers.
 *
 * Find the largest continuous sequence in a array which sums to zero.
 */
public class LargestContinuousSequenceZeroSum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(-3);
        list.add(-2);
        System.out.println(lszero(list));
    }

    public static ArrayList<Integer> lszero(ArrayList<Integer> A) {

        ArrayList<Integer> prefixSum = new ArrayList<>();
        int sum = 0;
        prefixSum.add(sum);
        for(int i=0; i<A.size(); i++) {
            sum += A.get(i);
            prefixSum.add(sum);
        }

        HashMap<Integer,Integer> hmap = new HashMap<>();

        int startIndex = -1;
        int endIndex = -1;
        int max = 0;
        for(int i=0;i<prefixSum.size();i++) {
            if(hmap.containsKey(prefixSum.get(i))){
                int value = hmap.get(prefixSum.get(i));
                if(max<(i-value)){
                    max = i-value;
                    startIndex = value;
                    endIndex  = i;
                }
                hmap.put(prefixSum.get(i), value);
            } else {
                hmap.put(prefixSum.get(i),i);
            }
        }

        ArrayList<Integer> finalList = new ArrayList<>();

        if(startIndex != -1 && endIndex != -1) {
            for (int i = startIndex; i<endIndex;i++ ){
                finalList.add(A.get(i));
            }
        }

        return finalList;
    }
}
