package com.recursion;

public class EvenSum {
    //Algorithm 1

    public static int evenSum1(int n) {
        if(n <= 1)
            return 0;

        else if (n % 2 == 0)
            return (n + evenSum1(n - 1));
        else
            return evenSum1(n - 1);
    }
    //Algorithm 2

    private static int evenSum2(int n){
        return (n/2)*(1 + n/2);
    }

    public static void main(String args[]){
        System.out.println(evenSum1(100));
        System.out.println(evenSum2(100));
    }
}
