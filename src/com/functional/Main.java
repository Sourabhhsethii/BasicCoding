package com.functional;

import com.streams.Genre;
import com.streams.Movie;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Method Reference
 *
 */
public class Main {
    public static void main(String[] args) {
        FuntionalProgram sumTest = Main::sumOfThreeNumbers;
        FuntionalProgram mulTest = Main::multipleOfThreeNumbers;
        System.out.println(sumTest.get(1,2,3));
        System.out.println(mulTest.get(1,2,3));


        List<Movie> movies = List.of(new Movie("a",10, Genre.THRILLER),
                new Movie("n",10, Genre.ACTION),
                new Movie("a",5, Genre.COMEDY),
                new Movie("a",50, Genre.COMEDY));

        Predicate<Movie> testNumber = (movie)->{
            return movie.getLikes()>=movie.getLikes();
        };

        System.out.println(testNumber.test(movies.get(0)));

    }
    public static int sumOfThreeNumbers(int a,int b,int c){
        int sum = 0;
        sum = a + b+ c;
        return sum;
    }

    public static int multipleOfThreeNumbers(int a,int b,int c){
        return a * b * c;
    }
}
