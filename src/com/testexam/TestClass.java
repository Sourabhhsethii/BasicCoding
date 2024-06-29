package com.testexam;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass {

    public static void main(String[] args) {
        final int score1= 8,score2=3;
        char score = 7;
        var goal = switch (score){

            default -> {if(10> score) {yield "result"; } else { yield "";}}
            case score1 -> "Great";
            case score2 -> "score";
            case 0 -> "bad";
        };
        System.out.println(goal);

        int[] array = {6,9,8};
        System.out.println("Binary Search " + Arrays.binarySearch(array,9));
        System.out.println("C" + Arrays.compare(array,new int[]{6,9,8}));
        System.out.println("M" + Arrays.mismatch(array,new int[]{6,9,8}));

        List<Integer> data = new ArrayList<>();
        IntStream.range(0,100).parallel().sequential().forEach(s-> data.add(s));
        System.out.println(data.size());

        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result = Stream.generate(()->"")
                .filter(notEmpty)
                .limit(1)
                .collect(Collectors.groupingBy(k->k))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(notEmpty));
        System.out.println(result);

    }
}
