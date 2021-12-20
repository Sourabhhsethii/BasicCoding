package com.oca.training.udemy.array;

import java.util.Arrays;

public class VariableArguments {
  /*  public static void main(String[] args) {

    }*/

    public static void main(String... args) {
        System.out.println(args.length);

        print(args);
        print("Java", "is", "the", "best");
        print("I", "love", "to", "work", "in", "java");
        print("variable", "arguments", "are", "nice" , "and", "useful");
    }

    public static void print(String... args) {
        System.out.println(Arrays.toString(args));
    }
}
