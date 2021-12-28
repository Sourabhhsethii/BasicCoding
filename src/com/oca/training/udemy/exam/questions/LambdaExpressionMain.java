package com.oca.training.udemy.exam.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressionMain {
    int age;

    public static void main(String[] args) {
        LambdaExpressionMain lx = new LambdaExpressionMain();
        lx.age = 1;
        check(lx, c ->c.age<5);

        List<String> list = new ArrayList<>();

        list.removeIf(s->s.isEmpty());
        // list.removeIf(s->{s.isEmpty()}); in bracket need return statement.
        list.removeIf(s->{return s.isEmpty();});
        list.removeIf((String s) -> s.isEmpty());

    }
    private static void check(LambdaExpressionMain lx, Predicate<LambdaExpressionMain> pred){
        String result = pred.test(lx) ? "match ": "notMatched";
        System.out.println(result);
    }
}
