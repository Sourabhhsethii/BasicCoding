package com.oca.training.udemy.test.test1;

import java.time.Period;

public class Test18 {
    public static void main(String [] args) {
        Period period = Period.of(10, 10, 888888);
        System.out.println(period);

        // Different Declaration of primitive int.
        int[][] arr = new int[8][];
        int[] arr2[] = new int[8][];
        int[] arr3 = new int[8];

        // System.out.println(sb.append(null).length()); // Compliation Error as Object cannot be null.
        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));

        StringBuilder sb2 = new StringBuilder(100);
        System.out.println(sb2.length() + ":" + sb2.toString().length());


    }
}