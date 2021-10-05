package com.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Sets in Java
 * Description
 * You are given an integer ‘n’, which represents the number of operations to be performed on a HashSet.
 *
 *
 *
 * Each operation has two integers a and b.
 *
 * ‘a’ represents the type of the operation, and ‘b’ represents the data value that is an integer.
 *
 * ﻿
 *
 * image.png 31.83 KB
 *
 * ﻿
 *
 * Input: The input will be in the following format:
 *
 * The first line will be ‘n’ indicating the number of operations.
 * The next ‘n’ lines will be two integers separated by a space, indicating the value of 'a' and 'b' respectively.
 * Output: The output should be in the following format:
 *
 * If the type of the operation is 2 (i.e., if the value of a is 2), then check whether the value of 'b' is present in the HashSet or not. If it is present, print 'true'. Otherwise, print 'false' in a new line.
 *
 * Sample Input-1:
 *
 * 6
 * 1 1
 * 1 3
 * 1 3
 * 2 3
 * 3 3
 * 2 3
 *
 *
 * Sample Output-1:
 *
 * true
 * false
 * The input 6 represents that in the next six lines of input will be key-value pairs. The six lines here are space-separated key-value pairs. The output is first true for the first 2 operations mentioned and the next one is false for the last 2 operations, as the value of b, which is 3, is already removed.
 *
 *
 *
 * Sample Input-2:
 *
 * 7
 * 1 1
 * 1 3
 * 1 2
 * 1 3
 * 2 2
 * 3 3
 * 2 3
 *
 *
 * Sample Output-2:
 *
 * true
 * false
 * The input 7 represents that in the next seven lines of input will be key-value pairs. The seven lines here are space-separated key-value pairs. The output is first true for the first 2 operations mentioned, which checks value=2,
 * and the next one is false for the last 2 operations because the value of b, which is 3, is already removed.
 */
public class SetsInJava {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // creating a HashSet named "hashSet"
        Set<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            // fill the switch cases below
            switch (a) {
                case 1:
                    hashSet.add(b);
                    break;

                case 2:

                    // If hashSet contains b, then print true. Otherwise, print false
                    if(hashSet.contains(b)){
                      System.out.println(true);
                    } else {
                        System.out.println(false);
                    }
                    break;

                case 3:
                    hashSet.remove(b);

                    break;
            }
        }
    }
}
