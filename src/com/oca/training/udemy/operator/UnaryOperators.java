package com.oca.training.udemy.operator;

public class UnaryOperators {
    public static void main(String[] args) {
        int x = +3; // + sign is redundant
        System.out.println("x="+ x);
        double y = -x;
        System.out.println("x=" + x + " y "+ y);

        y = - y; // -1 * y;
        System.out.println("x=" + x + " y "+ y);

        boolean a = true;
        boolean b = !a;
        System.out.println("a=" + a + " b "+ b);
        b = !b;

        System.out.println("a=" + a + " b "+ b);

        //  int muInt = !5; // does not compile
       // boolean myBoolean = -true; // does not compile.
       // boolean z = !10;
    }
}
