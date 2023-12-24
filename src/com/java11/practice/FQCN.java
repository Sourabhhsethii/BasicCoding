package com.java11.practice;

/**
 * Static Import
 */

import static java.lang.Math.*;

/**
 * Fully Qualified Named Class
 */
public class FQCN {
    public static void main(String[] args) {
        /*
            Fully Qualified Named Class
         */
        java.lang.String testString = "";

        /**
         * Static import reference
         */
        int radius = 2;
        double circumfrence = 2 * PI * radius;
        System.out.println(circumfrence);
    }
}
