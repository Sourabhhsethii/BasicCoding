package com.oca.training.udemy.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethod1 {

    public static void main(String[] args) {
       // List list = new ArrayList<>();
       List<Object> list= new ArrayList<>();

        list.add("dog");
        list.add(55);

        System.out.println(list);
        List<String> pets = new ArrayList<>();

        pets.add("Dog");
        pets.add("Cat");

        System.out.println(pets);

        pets.add(0,"Cat");
        System.out.println(pets);

      //  pets.add("Cant Any other data type than Strings");
        // cat, dog
        pets.add(1,"parrot"); // cat, parrot, dog
        pets.add(0, "husky"); // husky, cat, parrot, dog
        pets.add(1, "bird"); // husky,bird ,cat, parrot, dog

        System.out.println(pets);

        pets.remove("parrot");
        System.out.println(pets);

        pets.remove("Cat");
        pets.remove("Cat");
        System.out.println(pets);

        pets.set(0,"newBird");
        System.out.println(pets);

       // pets.set(6,"test"); // Array Index Out of Bonds Exception.
    }
}
