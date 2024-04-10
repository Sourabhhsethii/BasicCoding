package com.hashset;

import com.oca.training.udemy.test.classes.A;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        ArrayList<Integer> testCase = new ArrayList<>();
        testCase.add(2);
        testCase.add(3);
        testCase.add(3);
        testCase.add(4);
        System.out.println(longestConsecutive(testCase));
    }

    public static int longestConsecutive( List<Integer> A) {
        int count = 1;
        int max = 1;

        HashMap<Integer,Integer> hm = new HashMap<>();


        // lets eliminate duplicate entry
        for(int i =0;i<A.size();i++){
            if(hm.containsKey(A.get(i))){
                int value = hm.get(A.get(i));
                hm.put(A.get(i), ++value);
            } else {
                hm.put(A.get(i), 1);
            }
        }
        ArrayList<Integer>  temp = new ArrayList<>();
        for( Map.Entry<Integer, Integer> set: hm.entrySet()){
            temp.add(set.getKey());
        }

        Collections.sort(temp);


        if(temp.size() >1) {
            for (int i = 0; i < temp.size() - 1; i++) {
                int j = i + 1;

                if (temp.get(j) - temp.get(i) == 1) {
                    count++;
                    if (max < count) {
                        max = count;
                    }
                } else {
                    count = 1;
                    max = count;
                }
            }
        } else {
            max = 1;
        }

        return max;
    }
}
