package com.oca.training.udemy.test.test2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        processStringArray(arr,e-> e.length() <10);

        List list1 = new ArrayList<String>(); //Line 5
        List<String> list2 = new ArrayList(); //Line 6
        // List<> list3 = new ArrayList<String>(); //Line 7 // Compiler Error.
        List<String> list4 = new ArrayList<String>(); //Line 8
        List<String> list5 = new ArrayList<>(); //Line 9


        System.out.println(Arrays.toString(arr));

        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.print(formatter.format(date.minus(period))); // 2011-11-11 -> 11-11-11

        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove(new String("Y"));
        System.out.println(list);
    }

    private static void processStringArray(String [] arr,
                                           Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
