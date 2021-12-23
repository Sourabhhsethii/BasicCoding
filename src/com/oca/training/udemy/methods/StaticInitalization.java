package com.oca.training.udemy.methods;

import java.util.ArrayList;
import java.util.List;

public class StaticInitalization {

    private static final int SIZE;

    private static int one;

    private static final int two;

    private static final int three = 3;

    private static final List<String > NAMES = new ArrayList<>();
  //  private static final int four;

    static {
        System.out.println("first static int");
        int rows = 5;
        int colums = 4;

        SIZE = rows * colums;

    }

    static {
        System.out.println("third static init");
        NAMES.add("Jimmy");
        NAMES.add("Timmy");
    }

    static {
        System.out.println("second static init");
        one = 1;
        two = 2;
        one = three;
       // three = 3;
        // two = 2; // this will not complie as final variables cant assign asign
        one = three;
    }



    public static void main(String[] args) {

        System.out.println(NAMES);

    }
}
