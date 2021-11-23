package com.assignment;

import java.util.*;

/**
 * Find All Symmetric Pairs in an Array
 * Given an array of pairs of integers, find all the symmetric pairs in it. Two pairs (a, b) and (c, d) are said to be symmetric if b is equivalent to c and a is equivalent to d.
 *
 * For example, (10, 20) and (20, 10) are symmetric. It may be assumed that the first element in each pair is distinct.
 *
 */
public class FindAllSymmetricPairsInAnArray {
    public static void symmetricPair(int[][] arr) {
        LinkedHashMap<Integer,Integer> checkMap = new LinkedHashMap<Integer,Integer>();
        LinkedHashMap<Integer,Integer> result = new LinkedHashMap<Integer,Integer>();
        for (int i =0;i<arr.length;i++){

            int first = arr[i][0];
            int second = arr[i][1];

            if(checkMap.get(second) != null && checkMap.get(second) == first){
                result.put(second,first);
            } else {
                checkMap.put(first,second);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> itr = result.entrySet().iterator();
        if(!result.isEmpty()) {
            while (itr.hasNext()) {
                Map.Entry<Integer, Integer> entry = itr.next();
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } else {
            System.out.println("No Symmetric pair");
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int arr[][] = new int[row][2];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        symmetricPair(arr);
    }
}
