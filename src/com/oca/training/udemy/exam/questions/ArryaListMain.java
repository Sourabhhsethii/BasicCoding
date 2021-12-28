package com.oca.training.udemy.exam.questions;

import java.util.*;

public class ArryaListMain {
    public static void main(String[] args) {

        // Q1,2
        ArrayList I = new ArrayList();
        I.size();
        I.equals(I);

        //Q3
        List<Integer> list = Arrays.asList(10,4,14,5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);

        //Q4
        String[] names = {"Tommy", "Mike", "Anthony"};
       // List<String> list = names.asList(); // It will give array.


        //Q5
        List<String> one = new ArrayList<String>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");

        if(one == two)
            System.out.println("A");
        else if(one.equals(two))
            System.out.println("B");
        else
            System.out.println("C");

        //Q6
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);

        for (int age: ages) System.out.println(age);


    }
}
