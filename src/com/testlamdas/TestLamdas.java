package com.testlamdas;

import java.util.Comparator;
import java.util.function.Consumer;

@FunctionalInterface
abstract interface StringCheck{
    boolean beginCheck(String abc, int offset);
}

@FunctionalInterface
abstract interface StringBlank{
    boolean checkBank();
}

@FunctionalInterface
abstract interface StringEmpty{
    boolean checkEmpty(String string);
}


public class TestLamdas {

    public static void main(String[] args) {


        // Lamdas
        Runnable test = () -> {};
        Comparator test2 = (a,b) -> { return 1;};
        Comparable test3 = (a) -> { return 1;};

        // Method Reference
        Runnable test4 = TestLamdas::task1;
        Consumer test5 = TestLamdas::task2;
        test5.accept("1234");

        var str = "1234";
         StringCheck methodRef = str::startsWith;
        System.out.println(methodRef.beginCheck("23",1));
        System.out.println(methodRef.beginCheck("568",2));

        var tet= (StringBlank)str::isBlank;
        System.out.println(tet.checkBank());

        StringEmpty test8 = String::isEmpty;
        System.out.println(test8.checkEmpty(""));

    }


    static void task1(){
       System.out.println("test");
    }

    static void task2(Object a){
        System.out.println("test " + a);
    }

}
