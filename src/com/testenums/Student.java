package com.testenums;

public enum Student {
    A("ABC"),
    B("BBB"),
    C("CCC"),
    ;

    Student(String a) {

    }

    public static void main(String[] args) {
        Student st = Student.valueOf("B");
        System.out.println(st);

    }
}
