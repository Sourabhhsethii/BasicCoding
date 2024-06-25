package com.teststreamsapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsSource {
    public static void main(String[] args) {
        var stream = List.of(1,2,3).stream();
        System.out.println(stream);

        var stream2 = Arrays.asList(1,2,3).stream();
        System.out.println(stream2.count());

        var stream3 = Stream.of(1,2,3);
        System.out.println(stream3.max(Comparator.comparingInt(x -> x)));

        var stream4 = List.copyOf(List.of(1,2,3)).stream();
        System.out.println(stream4.parallel().findAny());
    }
}
