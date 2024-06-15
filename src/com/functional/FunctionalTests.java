package com.functional;


import com.oca.training.udemy.test.classes.predicate.test;

import java.util.List;

@FunctionalInterface
interface HelloWorld <T>{
    void print(T t);
}

public class FunctionalTests{

    public static void main(String[] args) {
            HelloWorld ft = (t) -> test(t);
            var list  =List.of(1,2,3,4);
            list.stream().forEach(FunctionalTests::test);
            ft.print(10);
    }

    static <T> void test(T t){
        System.out.println("test " + t);
    }

}
