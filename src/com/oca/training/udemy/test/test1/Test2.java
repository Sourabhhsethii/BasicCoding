package com.oca.training.udemy.test.test1;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws Error {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        // list.remove(100); // Its is trick -> remove method takes index.

        System.out.println(list);

        String fruit = "mango"; // Trick Mango is in small case.
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }


    }
}
