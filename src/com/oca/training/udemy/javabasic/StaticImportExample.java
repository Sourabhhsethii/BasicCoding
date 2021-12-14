package com.oca.training.udemy.javabasic;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static com.oca.training.udemy.javabasic.Config.*;
/**
 * Static Import
 */
public class StaticImportExample {
    public static void main(String[] args){
        int min = min(5,7);
        out.println("min = " + min);
        out.println(PI);

        printConfig();
        out.println("Name =" + NAME);
    }
}
