package com.testcollections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReviewQuestions {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque   = new ArrayDeque<>();

        deque.add(1);
        deque.add(2);
        System.out.println(deque.remove());
        System.out.println(deque.peek());
        System.out.println(deque.poll());
        System.out.println(deque.poll());

        System.out.println(deque.peek());

        List<? extends String> q = List.of("a","a");
        var v = List.of("a","b");
        List<?> i = List.of(1,2);
        List in = Arrays.asList(i);

      //  in.removeIf(x->(int)x>2);
     /*   q.removeIf(String::isEmpty);
        q.removeIf(s ->s.length() ==4);
        v.removeIf(String::isEmpty);
        v.removeIf(s ->s.length() ==4);*/

        var greetings = new ArrayDeque<>();

        greetings.offerLast("hello");
        greetings.offerLast("hi");
        greetings.offerFirst("ola");

        greetings.pop();
        greetings.peek();

        while (greetings.peek()!= null)
            System.out.print(greetings.poll());

        var test = new LinkedList<>();
        test.add("test1");
        test.offer("test2");
        test.offerLast("testLast");
        test.offerFirst("testFirst");
        test.addFirst("testAddFirst");
        System.out.println(test);

        test.pollLast();
        test.pollFirst();
        System.out.println(test);

        ReviewQuestions.<Exception>printException(new NullPointerException("test"));


    }

    static public  <T> T equal(T t){
        return t;
    }

    public static  <U extends Exception> void printException(U u){
        System.out.println(u.getMessage());
    }
}
