package com.oca.training.udemy.test.test1;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
     static public   void main(String [] a) {
        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");
        list.add(s);

        System.out.println(list);
    }
}
