package com.teststreamsapi;

import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsQuestions {
    public static void main(String[] args) {
        var stream = Stream.iterate("", x->x+"1");
       // System.out.println(stream.limit(2).map(x->x+2));
        stream.limit(2).map(x->x+"2").forEach(System.out::println);
        var stream2 = Stream.generate(Math::random);
        stream2.mapToInt(x->{ return (int) (x*100); } ).limit(10).forEach(System.out::println);

        Spliterator spliterator = Stream.generate(()-> "x").spliterator();
        spliterator.tryAdvance(System.out::println);
        var half = spliterator.trySplit();
        half.tryAdvance(System.out::println);

        Stream.generate(()-> "x").limit(10).forEach(System.out::print);

        IntStream.range(1,6).forEach(System.out::println);

        /* Optional<String> optionalInteger = Optional.of(null);

        optionalInteger.orElseThrow( RuntimeException::new); */

        Set<String> list = Set.of("test1", "test2", "test3");
        Stream.concat(list.stream(),list.stream()).sorted().distinct().findAny().ifPresent(System.out::println);
        Stream.concat(Stream.of(1,2,3),Stream.of(1,2,3)).forEach(System.out::println);

        var var = IntStream.empty();
        var test = var.min();
       // var test2 =  var.sum();
       // var.forEach(System.out::println);
       // var test3 =  var.average();

     /*   Stream st = Stream.generate(()->"Hello");
        st.allMatch(String::isEmpty);
        System.out.println();*/


    }
}
