package com.java11.practice;


public class Number {
    java.lang.Number numberj;
    Number number;
    public static final String APP_NAME ="Second";

    public Number(java.lang.Number numberj, Number number) {
        this.numberj = numberj;
        this.number = number;
    }

    public Number() {
    }

    public static void main(String[] args) {
        java.lang.Number n = 10;
        Number number = new Number(n, new Number());
        System.out.println(number);
    }
}
