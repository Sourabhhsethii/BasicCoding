package com.testrecord;

public class Main {

    public static void main(String[] args) {
        Record record = new Record(1);
        System.out.println(record);
        Record record2 = new Record(1,2);
        System.out.println(record2);

        Record2 record21 = new Record2();
        System.out.println(record21);

        Student student = new Student(1,2,4);
        System.out.println(student);

        // Static value will be take from above class object.
        Student student1 = new Student(1,2);
        System.out.println(student1);

    }
}
