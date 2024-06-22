package com.teststatic;

public class Main {

    static int test3;

    public static void main(String[] args) {
         final int test = 0;
        System.out.println(test);
        int test2 = 2;
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(Main.test3);
    }

    static void test() {
        test2();
    }

    static void test2(){
        test();
        /*test3();*/
    }

    void test3 (){

    }
}
