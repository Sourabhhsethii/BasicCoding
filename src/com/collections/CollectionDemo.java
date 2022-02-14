package com.collections;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        show();
        System.out.println(" Test ");
        showListDemo();
    }

    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        System.out.println(collection);

        Collections.addAll(collection,"a","b","c");
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.remove("a"));
        System.out.println(collection.size());
        collection.isEmpty();
        String[] striingArray = collection.toArray(new String[4]);
        System.out.println(Arrays.toString(striingArray));

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other);
        System.out.println(collection.equals(other));
    }

    // Difference between Collection and List is all bout indexes.
    public static void showListDemo() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        // Collection Does not support indexing
        list.add(0,"!");
        System.out.println(list);

        System.out.println(list.get(0));
        list.remove(0);
        Collections.addAll(list,"a", "b", "c");
        System.out.println(list.get(0));
    }

}
