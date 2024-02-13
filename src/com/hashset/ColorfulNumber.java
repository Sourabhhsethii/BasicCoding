package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Given a number A, find if it is COLORFUL number or not.
 *
 * If number A is a COLORFUL number return 1 else, return 0.
 *
 * What is a COLORFUL Number:
 *
 * A number can be broken into different consecutive sequence of digits.
 * The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324, 245 and 3245.
 * This number is a COLORFUL number, since the product of every consecutive sequence of digits is different
 */
public class ColorfulNumber {

    public static void main(String[] args) {
        System.out.println(colorful(236));
    }
    public static int colorful(int A) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        while(A>0){
            arr.add(A%10);
            A = A/10;
        }

        HashSet<Integer> hs = new HashSet<Integer>();

        for(int k=0;k<arr.size();k++){
            if(contains(hs,arr.get(k))){
                return 0;
            }
        }

        for(int k=0;k<arr.size();k++) {
            for(int l=k+1;l<arr.size();l++) {
                    int product =1 ;
                for(int m=k;m<=l;m++){
                    product *= arr.get(m);
                }
                if(contains(hs,product)){
                    return 0;
                }
            }
        }
        return 1;
    }

    static boolean contains(HashSet<Integer> hs, int number) {
        if(hs.contains(number)) {
            return true;
        } else {
            hs.add(number);
        }
        return false;
    }

}
