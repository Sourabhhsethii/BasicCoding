package com.oca.training.udemy.exception;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        method2();
    }
    public static void method() throws Exception{
        throw new Exception("Failed to load");
    }

    public static void method2() throws RuntimeException{
        throw new NullPointerException("Failed to load");
    }
}
