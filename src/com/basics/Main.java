package com.basics;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        for(int i=1;i<=number;i++){

            int temp = i;
            int workingNumber = temp;
            int sum = 0;
            while(workingNumber>0){
                int n = workingNumber % 10;
                int cube = n * n * n;
                sum = sum + cube;
                workingNumber = workingNumber/10;
            }

            if(sum ==  temp){
                System.out.println(temp);
            }

        }

    }
}