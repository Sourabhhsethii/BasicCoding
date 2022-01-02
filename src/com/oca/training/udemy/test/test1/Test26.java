package com.oca.training.udemy.test.test1;


class Student2 {
    String name;
    int marks;

    Student2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Test26 {
    public static void main(String[] args) {
        Student2 student2 = new Student2("James", 25);
        int marks = 25;
        review(student2, marks);
        System.out.println(marks + "-" + student2.marks);

            StringBuilder sb = new StringBuilder("Java");
            String s1 = sb.toString();
            String s2 = sb.toString();

            System.out.println(s1 == s2);

    }

    private static void review(Student2 stud, int marks) {
        marks = marks + 10;
        stud.marks+=marks;
    }
}