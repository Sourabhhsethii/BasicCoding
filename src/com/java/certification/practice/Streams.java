package com.java.certification.practice;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        var list = List.of("S", "P", "I", "R", "I", "T");
        list.forEach(System.out::print);
        list.stream().forEach(System.out::print);
        list.stream().map(ob-> ob).forEach(System.out::print);
        list.parallelStream().forEachOrdered(System.out::print);
        System.out.println(list.stream().collect(Collectors.joining()));

        String test = "123456789098764266";
        String test1 = (test.substring(0,Math.min(100, test.length())) +"_translated").toLowerCase();
        System.out.println(test1);


        class Score {
            int test;
            int number;
            TestName testName;


            public Score(int test, int number, TestName testName) {
                this.test = test;
                this.number = number;
                this.testName = testName;
            }

            public int getTest() {
                return test;
            }

            public void setTest(int test) {
                this.test = test;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            @Override
            public String toString() {
                return "Score{" +
                        "test=" + test +
                        ", number='" + number + '\'' +
                        '}';
            }

            static class TestName {
                String name;

                 public TestName(String name) {
                     this.name = name;
                 }
             }
        }

        var list1 = List.of(new Score(1,11,  new Score.TestName("English")), new
                Score(2,30,  new Score.TestName("English")));
        var total  = list1.stream().mapToDouble(x-> x.number).reduce(0,(result,value)->
        {
            return result + value;});
        System.out.println(total);
        list1.stream().map(x-> x.testName).map(x-> x.name).forEach(System.out::println);
        System.out.println();
    }
}
