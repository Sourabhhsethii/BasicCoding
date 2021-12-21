package com.oca.training.udemy.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(createArray());

        // for loop
        long startTime = System.currentTimeMillis();
        for(int i=0; i <list.size();i++){
            String temp = list.get(i);

        }
        long totalTime = System.currentTimeMillis() -  startTime;
        System.out.println("for loop totalTime = " + totalTime + " ms");

        // for each
        startTime = System.currentTimeMillis();

        for (String temp: list){

        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for each loop totalTimr = " + totalTime +  " ms");

        // iterator
        startTime = System.currentTimeMillis();

        for (Iterator<String> iterator  = list.iterator(); iterator.hasNext();){
             String temp = iterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;

        System.out.println("iterator totalTime = " + totalTime + " ms");

        // list Iterator
        for (ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext();){
            String temp = listIterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("ListIterator toltalTime = " + totalTime + "ms ");


    }

    private static String[] createArray(){
        String[] stringArray = new String[10_000_000];
        for (int i= 0; i < stringArray.length;i++){
            stringArray[i] = "Array " + i;
        }
        return stringArray;
    }
}
