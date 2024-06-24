package com.testcollections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("sam","test");
        map.values().forEach(System.out::println);

        System.out.println(" replace -> " +map.replace("sam","value"));
        System.out.println( " merge -> " +map.merge("sam"," test", (x,y)-> "   " +x+y));
        map.merge(null," test", (x,y)-> " " +x+y);
        map.merge(null," test2", (x,y)-> "  "+x+y);
        System.out.println(map);

        map.replaceAll((x,y)-> " replace all ->"+x+y);
        System.out.println(map);

        for (var entry: map.entrySet()){
            System.out.println( " < " +entry.getKey()  + " \t :  \t" + entry.getValue() + ">");
        }

        map.forEach((key,value) -> System.out.println(key + " : " + value));


    }
}
