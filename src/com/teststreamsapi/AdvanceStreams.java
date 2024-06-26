package com.teststreamsapi;

import java.util.Optional;
import java.util.function.Function;

public class AdvanceStreams {

    public static void main(String[] args) {

        printThreeDigitNumber(Optional.of(12));

        // Splitter
        // Collector
        Optional<Optional<Integer>> test = Optional.of(Optional.of(2));
        System.out.println(test.map(Optional::orElseThrow).get());
        System.out.println(test.get());
        System.out.println(test.flatMap(x->x).get());
    }

    static void printThreeDigitNumber(Optional<Integer> num){

      var test =   num.map(x->x+"").filter(x -> x.length() ==3);
      test.ifPresentOrElse(System.out::println, () -> System.out.println("Its less than 3 or more than 3"));

    }
}
