package com.testcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample implements Comparable {
    private  int rollNumber;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    ComparatorExample(String name, Integer rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }


    ComparatorExample(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public static void main(String[] args) {

        ComparatorExample c1 = new ComparatorExample("Test",2);
        ComparatorExample c2 = new ComparatorExample("Test", 1);

        ArrayList<ComparatorExample> comparatorExampleArrayList = new ArrayList<>();
        comparatorExampleArrayList.add(c1);
        comparatorExampleArrayList.add(c2);

        Comparator<ComparatorExample> comp = Comparator.comparing(ComparatorExample::getName).thenComparing(ComparatorExample::getRollNumber);
        Collections.sort(comparatorExampleArrayList,comp);
        System.out.println(comparatorExampleArrayList);
        comparatorExampleArrayList.add(new ComparatorExample("test0",0));
        System.out.println(comparatorExampleArrayList);
        comparatorExampleArrayList.sort(Comparator.comparingInt(x -> x.rollNumber));
        System.out.println(comparatorExampleArrayList);



    }

    @Override
    public String toString() {
        return "ComparatorExample{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        var compare = (ComparatorExample)o;
        return rollNumber-compare.rollNumber;
    }
}
