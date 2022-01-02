package com.oca.training.udemy.test.test1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Test19 {
    public static void main(String[] args) {
        String[] names = {"Smith", "Brown", "Thomas", "Taylor", "Jones"};
        List<String> list = new ArrayList<>();
        for (int x = 0; x < names.length; x++) {
            list.add(names[x]);
            switch (x) {
                case 2:
                    continue;
            }
            break;
        }
        System.out.println(list.size());

        Character var = 7;
        switch(var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }

        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond());

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(1);
        list2.add(0);

        list2.remove(list2.indexOf(0));

        // System.out.println(list2);

        int [] arr2 = {2, 1, 0};
        for(int i : arr2) {
            System.out.print(arr2[i]); // very Trick question, check it well.
        }

        System.out.println();

    }
}