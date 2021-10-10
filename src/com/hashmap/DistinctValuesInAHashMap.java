package com.hashmap;

import java.util.*;

/**
 * Distinct values in a HashMap
 * Description
 * You are given a HashMap with n number of keys and values. You need to print the distinct values in the same order as in HashMap.
 *
 *
 *
 * Example:
 *
 * Map = {1=A,2=A,3=B}
 *
 * Output: A B
 *
 1
 1 A

 3
 1 A
 2 A
 3 B


 *
 * Input: The input will be in the following format:
 *
 * The first line should be the number of elements present in the map.
 *  Next, n lines contain the key-value pairs.
 * The data type of HashMap is as follows:
 *
 * key: integer
 *
 * Value: string
 *
 *
 *
 * Output:
 *
 * The output should print the distinct values of HashMap, space-separated.
 */
public class DistinctValuesInAHashMap {
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

            for(Map.Entry<Integer, String> entry : map.entrySet()){
                lhs.add(entry.getValue());
            }

       Iterator<String> hst = lhs.iterator();
            while (hst.hasNext()){
                System.out.print(hst.next() + " ");
            }
    }

    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}
