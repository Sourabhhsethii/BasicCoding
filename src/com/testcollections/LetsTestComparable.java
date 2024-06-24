package com.testcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetsTestComparable implements Comparable {

    private String name;

    public LetsTestComparable(String name){
        this.name = name;
    }
    @Override
    public int compareTo(Object o) {
        var letsObject = (LetsTestComparable)o;
        return name.compareTo(letsObject.name);
    }

    @Override
    public String toString() {
        return "LetsTestComparable{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        LetsTestComparable letsTestComparable1 = new LetsTestComparable("DEF");
        LetsTestComparable letsTestComparable2 = new LetsTestComparable("ABC");

        var list = List.of(letsTestComparable1,letsTestComparable2);
        var list2 = new ArrayList<LetsTestComparable>();

        list2.add(letsTestComparable1);
        list2.add(letsTestComparable2);

        Collections.sort(list2);
        System.out.println(list2);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
