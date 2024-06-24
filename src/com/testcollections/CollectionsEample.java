package com.testcollections;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsEample {



    public static void main(String[] args) {
        Comparator comparator = (x,y) -> (int) ((int)x>(int)y?x:y);
        var list = List.of(10,2,3,4,1);
        Collections.sort(list,comparator);
        System.out.println(list);
    }
}
