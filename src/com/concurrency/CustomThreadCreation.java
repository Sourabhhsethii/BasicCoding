package com.concurrency;

import com.oca.training.udemy.classes.abstraction.Run;

import java.util.stream.Stream;

/**
 * Multithread Coded.
 */
public class CustomThreadCreation extends Thread {
    private int seed;

    public CustomThreadCreation(String threadName,int seed) {
        super(threadName);
        this.seed = seed;
    }

    public void run(){
        Stream<Integer> infiniteStream = Stream.iterate(this.seed, (t) -> t + this.seed);
        try{
            infiniteStream.forEach(s->{
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                   throw new RuntimeException("interrupted");
                }
                System.out.println(this.getName()+ ":" + s + " ");
            });
        } catch (RuntimeException e){
            System.out.println("\n Interrupted " + this.getName() +
                    "s execution");
        }
    }
}
