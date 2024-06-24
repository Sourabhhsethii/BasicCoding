package com.testoptional;

import java.util.Optional;

public class OptionalTest {

   static Optional<Double> takeAverage(int... a) {
        if(a.length == 0) return Optional.empty();
        else{
            Double sum = 0d;
            for (var val: a){
                sum+= val;
            }
            return Optional.of((double) (sum/a.length));
        }
    }


    public static void main(String... args) {
        var av = takeAverage(1,2,3);
        if(av.isEmpty())
            System.out.println("Its Empty");

        if(av.isPresent())
            System.out.println("Its avg : " + av.get());

    }
}
