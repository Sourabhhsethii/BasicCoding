package com.oca.training.udemy.arraylist;

import java.util.*;

public class SortingList {
    public static void main(String[] args) {
        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        System.out.println(numsList);
        Collections.sort(numsList);
        System.out.println(numsList);

        List<Integer> number = Arrays.asList(5,4,8,9,10,11);

        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);

    }
}
