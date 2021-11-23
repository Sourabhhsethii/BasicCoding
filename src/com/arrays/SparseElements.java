package com.arrays;

import java.util.*;

/**
 * Sparse Elements
 * You will be given two arrays, a collection of input strings and a collection of query strings. You need to determine how many times each element of the query string occurs in the list of input strings. Return the integer array of the results.

 *
 * Example:
 *
 * strings = ['ab', 'ab', 'abc']
 *
 * queries = ['ab', 'abc', 'bc']

 *
 * There are 2 instances of 'ab', 1 of 'abc' and 0 of 'bc'. For each query, add an element to the return array, results = [2, 1, 0].
 *
 * Sparse Elements
 * Description
 * You will be given two arrays, a collection of input strings and a collection of query strings. You need to determine how many times each element of the query string occurs in the list of input strings. Return the integer array of the results.
 *
 *
 *
 * Example:
 *
 * strings = ['ab','ab','abc']
 * queries = ['ab','abc','bc']
 *
 *
 * There are 2 instances of 'ab', 1 of 'abc' and 0 of 'bc'. For each query, add an element to the return array, results = [2, 1, 0].
 *
 *
 *
 * Sample input:
 *
 * 4
 *
 * aba
 *
 * baba
 *
 * aba
 *
 * xzxb
 *
 * 3
 *
 * aba
 *
 * xzxb
 *
 * ab
 *
 *
 *
 * Sample output:
 *
 * 2
 *
 * 1
 *
 * 0
 */
public class SparseElements {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);

        // number of the strings elements
        int n = in.nextInt();
        String strings[] = new String[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            strings[i] = in.next();
        }

        // number of the query elements
        int m = in.nextInt();
        String queries[] = new String[n];



        for(int j =0;j<m;j++){
            queries[j] = in.next();
        }

        LinkedHashMap<String,Integer> map = new LinkedHashMap();

        for (int j=0;j<m;j++){
            map.put(queries[j],0);
        }


        for (int j=0;j<m;j++){
            String query = queries[j];
                 for (int i =0; i<n;i++){
                     if(map.containsKey(query)){


                         if(query.equalsIgnoreCase(strings[i])){
                            int count = map.get(query);
                                count = count + 1;
                                map.put(query,count);
                         }

                     }
                 }
        }

        for( Map.Entry<String,Integer> key: map.entrySet()){
            System.out.println(key.getValue());
        }

    }
}
