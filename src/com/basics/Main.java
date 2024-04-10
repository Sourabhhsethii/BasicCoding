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

    void test(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1: {System.out.print("January"); break;}
            case 2: {System.out.print("February"); break;}
            case 3: {System.out.print("March"); break;}
            case 4: {System.out.print("April"); break;}
            case 5: {System.out.print("May"); break;}
            case 6: {System.out.print("June"); break;}
            case 7: {System.out.print("July"); break;}
            case 8: {System.out.print("August"); break;}
            case 9: {System.out.print("September"); break;}
            case 10: {System.out.print("October"); break;}
            case 11: {System.out.print("November"); break;}
            case 12: {System.out.print("December"); break;}
            default: break;
        }
    }
}