package com.oca.training.udemy.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        Object[] nameArray = names.toArray();
        System.out.println(nameArray.length);

        String[] stringArray = names.toArray(new String[0]);
        String[] anotherStringArry = names.toArray(new String[names.size()]);

        String[] petArray = new String[] {"dog", "cat", "parrot"};

        List<String> petsList = Arrays.asList(petArray);
        System.out.println(petsList);

        petsList.set(0, "bird");
        System.out.println(petsList);
        System.out.println(Arrays.toString(petArray));

        petArray[0] = "husky";
        System.out.println(petsList);
        System.out.println(Arrays.toString(petArray));

        // petsList.add("newDog"); //Cant add in Fixed Size array build from asList method of array.
        // petsList.remove(1); //  Cant add in Fixed Size array build from asList method of array.

        List<String> list = Arrays.asList("one", "two", "three");
        System.out.println(list);
        // list.add("four"); //Cant add in Fixed Size array build from asList method of array.


    }
}
