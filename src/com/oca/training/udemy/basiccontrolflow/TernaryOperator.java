package com.oca.training.udemy.basiccontrolflow;

public class TernaryOperator {

    public static void main(String[] args) {
        int x = 10;
        int y;

        if(x>5){
            y = 2 * x;
        } else {
            y = 4 * x;
        }

        System.out.println("y= " + y);

        // ternary operator
       // y = x > 5 ? 2 * x : 4 * x;
        y = (x>5)? (2 * x) : (4 *x); // nicer to read

        System.out.println("y= " + y);
    }
}
