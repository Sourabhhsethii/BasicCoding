package com.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<Movie> movies = List.of(new Movie("a",10, Genre.THRILLER),
                new Movie("n",10, Genre.ACTION),
                new Movie("a",5, Genre.COMEDY),
                new Movie("a",50, Genre.COMEDY));

        var logObject = movies.stream().map(movie -> movie.clone());

        var logObjectList = logObject.map(movie -> {
            movie.setTitle(null);
            return movie;
        }).collect(Collectors.toList());

        System.out.println(logObjectList);
        System.out.println(movies);

        String val = "10008232232323232323";

        System.out.println(val.substring(0,val.length()>10? 10:val.length()-1));

    }
}
