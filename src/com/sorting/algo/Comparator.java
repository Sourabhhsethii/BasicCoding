package com.sorting.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Comparator {
    public static void main(String[] args) {

        java.util.Comparator c = Comparator::comparator;

        Integer  arr [] = new Integer[] { 1,2,3,5,};
        var list = Arrays.asList(arr);
        Collections.sort(list,c);
        list.stream().forEach(x-> System.out.println(" " + x));

    }

    static int comparator(Object a, Object b){
        Integer x = (Integer) a;
        Integer y = (Integer) b;
        if(x>y){
            return -1;
        } else {
            return 1;
        }
    }
}
