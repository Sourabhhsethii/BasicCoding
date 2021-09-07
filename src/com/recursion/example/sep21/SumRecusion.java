package com.recursion.example.sep21;

import java.util.Scanner;

class SumRecusion{
    public static int sum(int n){
        //terminate condition
        if(n<1){
            return n;
        }else{
            //work
            // &
            //call itself
            return n+ sum(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            int value = SumRecusion.sum(n);
            System.out.print(value);
        }
        else{   System.out.println("Enter a natural number");
        }
    }
}
