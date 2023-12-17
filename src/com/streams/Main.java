package com.streams;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Movie> movies = List.of(new Movie("a",10), new Movie("n",10),new Movie("a",5),new Movie("a",50));

        /**
         * Imperative Programming ?? How something should me done????
         */
        int count = 0;
        for(Movie movie: movies){
            if(movie.getLikes()>10){
                count++;
            }
        }
        System.out.println(count);

        /**
         * Declarative ?? What should be done?
         * Stream allows a collection of data in a declarative way!!
         * Stream is a way of getting the data & processing it.
         * we have channing of methods to process the method.
         */
        System.out.println(movies.stream().filter(movie -> movie.getLikes()>10).count());

        /**
         * Create A stream
         */
       var list = new ArrayList<>();
       list.stream();

       int[] numbers = new int[6];
        numbers[2] = 2;
        Arrays.stream(numbers).forEach(n -> System.out.println(n));

        /**
         * Create Streams from Arbitary numbers!!
         */
        Stream.of(1,2,3,4,5);
        System.out.println(Stream.generate(()-> Math.random()).iterator());
        Stream.iterate(1, n-> n+2)
                .limit(10)
                .forEach(n-> System.out.println(n));

        movies.stream().map(movie-> movie.getTitle()).filter(movie -> movie == "a").forEach(System.out::println);

        /**
         * Flat Map
         */
        var stream = Stream.of(List.of(1,2,3), List.of(4,5,6));
       // stream.forEach(System.out::println);
        // Flat this list, we need to work with numbers!!
        AtomicInteger total= new AtomicInteger();
        stream.flatMap(list1->list1.stream())
                .forEach(n-> {
                    total.addAndGet(n);
                    System.out.println(n);
                } );
        System.out.println(total);

        movies.stream()
                .filter(movie -> movie.getLikes()>10)
                .forEach(movie -> System.out.println(movie.getLikes() + "Movies " +  movie.getTitle()));

        /**
         * SLICING Streams
         */
        movies.stream().skip(1).limit(2).forEach(System.out::println);

        // Take Likes
        movies.stream().takeWhile(m-> m.getLikes()<30)
                .forEach(System.out::println);
        movies.stream().dropWhile(movie -> movie.getLikes()<30)
                .forEach(System.out::println);
        movies.stream().sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(System.out::println);

        // Get Unique Value
        movies.stream().map(Movie::getLikes).distinct().forEach(like-> System.out.println(like));

        // Peeking -> Used for trouble Shooting
        //Intermediate Operation we use it for to build processing pipeline
        // Peeking the values
        movies.stream().filter(movie -> movie.getLikes()>10).peek(System.out::println)
                .map(m->m.getTitle()).peek(System.out::println)
                .forEach(System.out::println);

        /**
         * Simple Reducers
         * count()
         * anyMatch
         * allMatch()
         * noneMatch()
         * firstAny
         */

       var result = movies.stream()
                .anyMatch(movie -> movie.getLikes()>10);
        System.out.println(result);


        var result2 = movies.stream()
                .noneMatch(movie -> movie.getLikes()>10);
        System.out.println(result2);

        var result3 = movies.stream()
                .findFirst()
                .get();
        System.out.println(result3);

        var result4 = movies.stream().max(Comparator.comparing(Movie::getLikes));
        System.out.println(result4);

        /**
         * Genral Purpose reducer
         */
        var result5 = movies.stream().map(Movie::getLikes)
                .reduce((a,b)-> a+b);
        result5.orElse(0);
        System.out.println(result5);


        var result6 = movies.stream().map(Movie::getLikes)
                .reduce(0,Integer::sum);
        result5.orElse(0);
        System.out.println(result6);

        /**
         * Collectors!!!
         */

        var result7 = movies.stream().filter(m-> m.getLikes()>10)
                .collect(Collectors.toList());
        System.out.println(result7);

        var result8 = movies.stream().filter(m-> m.getLikes()>10)
                .collect(Collectors.toMap(Movie::getTitle,movie -> movie.getLikes()));
        System.out.println(result8);

        var result9 = movies.stream().filter(m-> m.getLikes()>10)
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println(result9);

        var result10 = movies.stream().filter(m-> m.getLikes()>10)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println(result10);
        /**
         *
         */
    }
}
