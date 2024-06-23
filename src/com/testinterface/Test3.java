package com.testinterface;

public class Test3 implements Test2,Test {
    @Override
    public void test1() {

    }

    @Override
    public void test3() {
        Test2.super.test3();
        Test2.test4();
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.test3();
    }
}
