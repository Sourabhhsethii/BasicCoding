package com.testrecord;

public record Record2() {
    static int test2 = 1;
    public Record2 {
        int test = -1;
        System.out.printf("Record Initialized " + test + test2);
    }
}
