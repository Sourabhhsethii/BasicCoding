package com.collections;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        System.out.println(" Collections ");
        show();
        System.out.println(" List ");
        showListDemo();
        System.out.println(" Compare able Interface ");
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a", "e3"));
        customers.add(new Customer("c", "e2"));
        customers.add(new Customer("b", "e1"));
        Collections.sort(customers);
        System.out.println(customers);
        System.out.println("Comparator  Interface ");

        System.out.println("Queue");
        showListQueue();
        System.out.println("Set");
        showListSet();
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

    public static void showListQueue() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        var front = queue.peek();
        System.out.println(front);
        var remove = queue.remove();
        System.out.println(remove);
        System.out.println(queue);
    }

    // No Duplicates Only Unique Values & No Orders.
    public static void showListSet() {
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("Blue");
        set.add("Blue");
        set.add("is");
        set.add("is");
        System.out.println(set);
    }

}
