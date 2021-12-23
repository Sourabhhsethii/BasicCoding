package com.oca.training.udemy.methods;

public class UsingStaticMethodsPart1 {
    public static void main(String[] args) {
        UsingStaticMethod2 us = new UsingStaticMethod2();

        System.out.println(us.count); // warning
        System.out.println(UsingStaticMethod2.count);

        UsingStaticMethod2 another = new UsingStaticMethod2();
        another.incrementCounter(); // warning

        UsingStaticMethod2.incrementCounter();
        System.out.println(UsingStaticMethod2.count);

        us = null;
        another = null;

        System.out.println(UsingStaticMethod2.count);
        System.out.println(us.count);
        System.out.println(another.count);

        UsingStaticMethod2.count = 10;
        UsingStaticMethod2 newInstance = new UsingStaticMethod2();
        newInstance.count =5;
        another.count =11;

        System.out.println(UsingStaticMethod2.count); // 11 // beacuse static variable is shared with all the instances.
        System.out.println(another.count);
        System.out.println(us.count);



    }
}
