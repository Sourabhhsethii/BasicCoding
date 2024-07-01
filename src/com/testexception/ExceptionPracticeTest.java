package com.testexception;

public class ExceptionPracticeTest {

    public static void main(String[] args) {
        Integer a = null;
        if(a > 1) {
            System.out.println("greater than 1");
        }

        Character s = null;
        System.out.println(s.charValue());
    }
}
