package com.teststreamsapi;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teeing {
    public static void main(String[] args) {


        var st1 = Stream.of(1,2,3);
        var st2 = Stream.of(2,3,4);

        var str3 = Stream.concat(st1,st2).distinct().sorted().map(x->x+"").collect(Collectors.joining(","));
        System.out.println(str3.formatted(""));

        var str4 = Stream.of(1,2,3,4,5).distinct().sorted().map(x->x+"")
                .collect(Collectors.teeing(Collectors.joining(": "),
                        Collectors.joining(" , "),
                (x,y)-> new number(x,y)));
        System.out.println(str4);
        System.out.println(str4.cmma);
    }

    record number(String col, String cmma){

    }
}
