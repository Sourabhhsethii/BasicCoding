package com.oca.training.udemy.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethod2 {
    public static void main(String[] args) {
        List<String > pets = new ArrayList<>();
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        if(pets.isEmpty()){
            System.out.println("no pets");
        }

        if(pets.size() == 0){
            System.out.println("no pets");
        }

        pets.add("cat");
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        // clear method - removes all methods from list.
        pets.clear();
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        System.out.println();
        pets.add("dog");
        System.out.println(pets.contains("cat")); // false
        System.out.println(pets.contains("dog")); // true

        List<String> newPets = new ArrayList<>();
        newPets.add("dog");

        System.out.println(pets.equals(newPets));

        System.out.println();
        newPets.add("cat");
        System.out.println(pets.equals(newPets));

        pets.add(0,"cat");
        System.out.println(newPets);

        System.out.println(pets);
        // size and elements are equal but order of elements is not equal.
        System.out.println(pets.equals(newPets));

    }
}
