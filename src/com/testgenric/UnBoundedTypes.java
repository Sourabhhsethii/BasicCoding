package com.testgenric;

import java.util.ArrayList;
import java.util.List;

public class UnBoundedTypes {

    void print(List<?> objectList){
        for (var obj: objectList)
            System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(123);
        test.add(123);

        UnBoundedTypes b = new UnBoundedTypes();
        b.print(test);
    }

}
