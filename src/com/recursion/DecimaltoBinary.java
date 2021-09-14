package com.recursion;

import java.util.Scanner;

public class DecimaltoBinary {
    static int decToBin(int n)
    {
        int binary = 0;
        if(n == 0){
            binary = 0;
            return binary;
        }
        else {
            binary = n % 2 + 10 * (decToBin(n/2));
        }
        return binary;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println(decToBin(n) + "\n" );
    }
}
