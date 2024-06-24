package com.testgenric;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BoundedType {

    public static void main(String[] args) {
        List<? super ClassB>  test = new ArrayList<ClassA>();
        List<? super ClassB>  test2 = new ArrayList<ClassB>();
        List<? extends ClassB>  test3 = new ArrayList<ClassB>();
        List<? extends ClassB>  test4 = new ArrayList<ClassC>();

        List<? super Exception> ex = new ArrayList<Object>();
        ex.add(new FileNotFoundException());
        ex.add(new IOException());
        ex.add(new Exception());
        System.out.println(ex
        );
    }
}
