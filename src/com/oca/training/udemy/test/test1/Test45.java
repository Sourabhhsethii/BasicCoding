package com.oca.training.udemy.test.test1;

public class Test45 {
    public static void main(String[] args) {
        String [] arr = {"I", "N", "S", "E", "R", "T"};
        for(int n = 1; n <= arr.length; n += 2) {
            if (n % 2 == 0) {
                continue;
            }
            System.out.print(arr[n]); //Line n1
        }
    }
}
