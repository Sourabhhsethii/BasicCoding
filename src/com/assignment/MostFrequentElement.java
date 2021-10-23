package com.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Given an array of integers, find the most frequent element in the array. If multiple elements appear a maximum number of times, print any one of them. Return -1 in case there are no elements.
 *
 *
 *
 * Sample input 1:
 * 5
 * 7 8 9 4 9
 *
 * Sample output 1:
 * 9
 *
 * This is because out of the elements [7 8 9 4 9], 9 is the only one which occurs the maximum no. of times (twice)
 *
 *
 *
 * Sample input 2:
 * 0
 *
 * Sample output 2:
 * -1
 *
 * This is because no elements are there over which the function may be called, hence we return -1
 *
 * Most Frequent Element
 * Description
 * Given an array of integers, find the most frequent element in the array. If multiple elements appear a maximum number of times, print any one of them. Return -1 in case there are no elements.
 *
 * Input Format:
 *
 * The first line contains the size of the array, N.
 *
 * The second line contains the elements of the array.
 *
 * Output Format:
 *
 * The output contains the most frequent element in the array.
 * Sample Test Cases:
 *
 * Input:
 *
 * 8
 *
 * 1 3 2 5 2 1 9 2
 * Output:
 *
 * 2
 *
 * Input:
 *
 * 8
 *
 * 10 15 12 11 13 12 11 11
 *
 * Output:
 *
 * 11
 */
public class MostFrequentElement {
    public static int mostFrequentElement(int[] arr) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int mostFrequentNumber = 0;
        for (int i=0;i<arr.length;i++){

            if(hmap.isEmpty()){
                hmap.put(arr[i],1);
            } else {
                if(hmap.containsKey(arr[i])){
                    int count = hmap.get(arr[i]);
                    count += 1;
                    hmap.put(arr[i],count);
                } else {
                    hmap.put(arr[i],1);
                }
            }

        }

        int max = Integer.MIN_VALUE;

        for (Map.Entry<Integer,Integer> key: hmap.entrySet()){
            if(key.getValue()>max){
                mostFrequentNumber = key.getKey();
                max = key.getValue();
            }
        }

        return mostFrequentNumber;
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mostFrequentElement(arr));
    }
}
