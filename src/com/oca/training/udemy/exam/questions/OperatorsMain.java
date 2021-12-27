package com.oca.training.udemy.exam.questions;

public class OperatorsMain {
    public static void main(String[] args) {

        // Q1 - Which operators can be used with booleans.
        boolean abc = true,def = false;
        System.out.println(!abc == !def);

        // Q2
        byte x = 5;
        byte y = 1;
        double z = x+y;

        //Q3
        long a =10;
        int b = (int)((short) 2 * a);

        //Q4
        int c = 7; //7
        int result = 4;  //4
        result += ++c; // ++7 -> 8 - result = 8 + 4 => 12
        System.out.println(result);
    }
}
