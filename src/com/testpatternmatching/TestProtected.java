package com.testpatternmatching;

public class TestProtected extends com.testprotected.TestProtected {
    public static void main(String[] args) {

        TestProtected testProtected = new TestProtected();
        testProtected.test();

    }

    void test(){
        test1();
    }
}
