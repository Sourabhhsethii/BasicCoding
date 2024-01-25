package com.java.certification.practice;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        byte b = 99;
        System.out.println(b);

        final int x = 99;
        byte c = x;
        System.out.println(c);


        /**
         * Fails
         * It is not final int hence the value of d can change in future which will not fit into g
         *  int d = 99;
         *  byte q = d;
         *  System.out.println(g);
         */

        int n = 0 + new Random().nextInt(4);
        System.out.println(n);

    }
}
