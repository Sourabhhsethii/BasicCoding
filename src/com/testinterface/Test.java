package com.testinterface;

public interface Test {

    public abstract void test1();
    public static void test2(){
        System.out.printf("Hello");
    }

    default void test3(){
        System.out.printf("test 3");
        test2();
        test4();
        test5();
        test6();
    }

    static void test4(){
        System.out.printf("test4");
        test6();
        test2();
    }

    private void test5(){
        System.out.printf("test5");
        test6();
        test3();
        test1();
        test2();
        test4();
    }

    static private void test6() {
        System.out.printf("test6");
        test4();
        test2();
    }
}
