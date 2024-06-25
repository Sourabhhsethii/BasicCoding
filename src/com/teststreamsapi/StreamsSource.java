package com.teststreamsapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsSource {
    public static void main(String[] args) {
        var stream = List.of(1,2,3).stream();
        System.out.println(stream);

        var stream2 = Arrays.asList(1,2,3).stream();
        System.out.println(stream2.count());

        var stream3 = Stream.of(2,2,3);
        System.out.println(stream3.max(Comparator.comparingInt(x -> x)));

        var stream4 = List.copyOf(List.of(2,2,3)).stream();
        // System.out.println(stream4.parallel().findAny()); 

        // stream4.map(x->x*2).forEach(System.out::println);

        var testSteams = stream4.parallel().collect(TreeSet::new,TreeSet::add,TreeSet::addAll);
        System.out.println(testSteams);
        System.out.println(testSteams.stream().count());

        var testStream2 = testSteams.stream().collect(Collectors.toMap(x-> {
            return x;
        },y->y));
        System.out.println(testStream2);

        // Stream Pipelines
        // foreach -> Consumer
        // map -> Function
        // Filer -> Predicate
        testSteams.stream().map(x->Integer.valueOf((Integer) x)*2).filter(x-> x>2).skip(1).limit(1).forEach(System.out::println);

        var list7 = List.of("Lets", "Do","Something");
        var list8 = List.of("Lets", "Do","Something");
        var list9 = List.of(1,2,3,4,5,6,7,8);

        var list10 = List.of(list7,list8,list9);
        list10.stream().peek(x-> {
            System.out.println("peek -> " + x);
        }).flatMap(x-> x.stream()).forEach(System.out::println);
        System.out.println( "Size " + list10.size());

        var list11 = list10.stream().flatMap(z->z.stream())
                .collect(Collectors.toList());
        System.out.println(list11);

        List.of(1,2,3).stream().peek(System.out::println).sorted(Comparator.reverseOrder()).forEach(System.out::print);



    }
}
