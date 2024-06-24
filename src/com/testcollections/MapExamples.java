package com.testcollections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("sam","test");
        map.values().forEach(System.out::println);

        map.replace("sam","value");
        map.merge("sam"," test", (x,y)-> "   " +x+y);
        map.merge(null," test", (x,y)-> " " +x+y);
        map.merge(null," test2", (x,y)-> "  "+x+y);
        System.out.println(map);

        map.replaceAll((x,y)-> " replace all ->"+x+y);
        System.out.println(map);


    }
}
