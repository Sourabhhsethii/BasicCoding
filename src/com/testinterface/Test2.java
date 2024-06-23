package com.testinterface;

public interface Test2 {

    default void test3(){
        System.out.println("Test3 from Test2 Interface ");
    }

    static void test4() {
        System.out.println("test4 from Test2 Interface ");
    }
}
