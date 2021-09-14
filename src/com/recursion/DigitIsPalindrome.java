package com.recursion;

import java.util.Scanner;

/*
Write a Java program using recursion to check if an input of five digits is a palindrome. A palindrome is a sequence of characters that reads the same backwards and forwards.
Example: 98789
Input format: The input should have all the five digits of the number with one digit in every line. The digit in the unit's place will be the last line.
Output format: It should print true/false corresponding to whether the input is a palindrome or not.
==> 98789
 */
public class DigitIsPalindrome {
    public static boolean palindrome(int[] num, int index) {

        // work
        int reducelength = num.length - index;
        boolean flag = false;

        //Base condition
        if (reducelength == index && num[reducelength] == num[index]) {
            flag = true;
        } else if(index>reducelength){
            flag = false;
        }

        if (index>reducelength && num[reducelength] == num[index]  ) {

             palindrome(num, index + 1);
            flag = true;
        } else {
            flag = false;
        }
        return flag;

    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[5];
        for (int i = 0; i < 5; i++)
            num[i] = sc.nextInt();
        boolean answer = palindrome(num, 0);
        System.out.println(answer);
    }
}
