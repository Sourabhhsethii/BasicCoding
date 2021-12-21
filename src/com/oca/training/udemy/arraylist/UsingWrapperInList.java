package com.oca.training.udemy.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UsingWrapperInList {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(10.5); // autoboxing
        doubleList.add(2.0); // autoboxing

        doubleList.remove(55.10);
        double first = doubleList.get(0); // unboxing

        System.out.println(doubleList);
        System.out.println(first);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);
        numbers.add(null);

        System.out.println(numbers);

       // int number = numbers.get(0); // null pointer exception - int cant hold/be null

        List<Integer> nums = new ArrayList<>();
        nums.add(1); //0
        nums.add(2); //1
        nums.remove(1);
      //  nums.remove(new Integer(1)); // This is the trick. Remember the tricks.

        System.out.println(nums);


    }
}
