package com.teststreamsapi;

import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreams {

    public static void main(String[] args) {

        var list1 = List.of(1,2,3);
        IntStream stream = list1.stream().flatMapToInt(z-> IntStream.of(z));
        System.out.println(stream.max().stream().summaryStatistics() );

        var list2 = List.of(1.1,2.2,3.3);
        DoubleStream stream1 = list2.stream().flatMapToDouble(d-> DoubleStream.of(d));
        System.out.println(stream1.summaryStatistics());

        var list3 = List.of(1121212,121212,121212);
        LongStream stream2 = list3.stream().flatMapToLong(l-> LongStream.of(l));
        System.out.println(stream2.summaryStatistics());

        IntStream.rangeClosed(1,20).skip(2).parallel().limit(5).sorted().forEach(System.out::println);
        DoubleStream.generate(Math::random).limit(2).parallel().skip(1).sorted().forEach(System.out::println);
        LongStream.range(1,3).forEach(System.out::println);

        System.out.println("...............Summary.............");
        var summary = IntStream.rangeClosed(1,20).skip(2).parallel().limit(5).sorted().summaryStatistics();
        System.out.println(summary.getMax()-summary.getMin());
    }

}
