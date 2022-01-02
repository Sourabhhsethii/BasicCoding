package com.oca.training.udemy.test.classes.test;

import com.oca.training.udemy.test.classes.A;
import com.oca.training.udemy.test.classes.B;

public class Test {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = (B) obj1; // Class Cast Exception is thrown.
        obj2.print();
    }
}