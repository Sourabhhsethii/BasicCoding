package com.oca.training.udemy.test.test1;

public class InfiniteLoop {
    public static void main(String[] args) {
        int x = 1;
        while(checkAndIncrement(x)) {
            System.out.println(x);
        }
    }

    private static boolean checkAndIncrement(int x) {
        if(x < 5) {
            x++;
            return true;
        } else {
            return false;
        }
    }
}