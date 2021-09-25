package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * FizzBuzz
 * Problem Description
 *
 * Given a positive integer A, return an array of strings with all the integers from 1 to N. But for multiples of 3 the array should have “Fizz” instead of the number. For the multiples of 5, the array should have “Buzz” instead of the number. For numbers which are multiple of 3 and 5 both, the array should have "FizzBuzz" instead of the number.
 *
 * Look at the example for more details.
 *
 *
 *
 * Problem Constraints
 * 1 <= A <= 500000
 *
 *
 *
 * Input Format
 * The first argument has the integer A.
 *
 *
 *
 * Output Format
 * Return an array of string.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = 5
 *
 *
 * Example Output
 * Output 1:
 *
 *  [1 2 Fizz 4 Buzz]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  3 is divisible by 3 so it is replaced by "Fizz".
 *  Similarly, 5 is divisible by 5 so it is replaced by "Buzz".
 */
public class FizzBuzz {

    public static String[] fizzBuzz(int A) {
        String[] result = new String[A];
        for (int i=0;i<result.length;i++){
            int nextNumber  = i + 1;
             if((nextNumber)%3 == 0){
                if((nextNumber)%5 == 0){
                    result[i] = "FizzBuzz";
                } else {
                    result[i] = "Fizz";
                }
            } else if ((nextNumber)%5 == 0){
                result[i] = "Buzz";
            }  else {
                result[i] = String.valueOf(i+1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(Arrays.toString(fizzBuzz(input)));
    }
}
