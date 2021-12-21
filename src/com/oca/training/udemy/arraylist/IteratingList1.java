package com.oca.training.udemy.arraylist;

import java.util.*;

public class IteratingList1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        for (int i = 0; i<numbers.size();i++){
            System.out.println("elements at index " + i + " is" + numbers.get(i));
           // numbers.remove(i); // Index out of bound;
        }

        for (Integer number: numbers){
            System.out.println("numbers= " + number);
           // numbers.remove(2); // ConcurrentModificationException
        }

        // While Iterarting, we can remove the items from the List.
        for (Iterator<Integer> itr = numbers.iterator(); itr.hasNext();){
                Integer number = itr.next();
                System.out.println(number);
                itr.remove();
        }

        System.out.println(numbers);
        numbers.addAll(Arrays.asList(1,2,3,4,5,6));

        for(ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious(); ){
            System.out.println(listIterator.previous());
            listIterator.remove();
        }

        System.out.println(numbers);

    }
}
