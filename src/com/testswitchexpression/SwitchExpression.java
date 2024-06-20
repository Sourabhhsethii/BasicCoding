package com.testswitchexpression;

public class SwitchExpression {
    public static void main(String[] args) {
        System.out.println("Switch Expression");

        int x = 10;

        var test = switch (x) {

            case 1 -> 1;
            case 2 -> { yield 2;
            }
            default -> {
                yield 0;
            }

        };

        switch (x) {

            case 1 -> System.out.println(1);

        }

        System.out.println(test);
    }
}
