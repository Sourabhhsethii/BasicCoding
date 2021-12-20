package com.oca.training.udemy.arraylist;

import java.util.ArrayList;
import java.util.List;

// Dynamic Array
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();

        ArrayList<Object> myList2 = new ArrayList<>(); // It can hold any things

        ArrayList<String> list = new ArrayList<>(); // It can hold only Strings

        ArrayList<String> list2 = new ArrayList<>();

        List<String> list3 = new ArrayList<>(); // using interface as type // Poly-morphism

        // ArrayList<String> list4 = new List<String>(); // Doesnt complie

        List<String> list5 = new ArrayList<>(20);
    }



}
