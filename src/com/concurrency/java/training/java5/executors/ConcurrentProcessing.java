package com.concurrency.java.training.java5.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ConcurrentProcessing {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var first = CompletableFuture.supplyAsync(()->{
            LongTask.simulate();
            return 20;
        });

        var second = CompletableFuture.supplyAsync(()->{
            return 10;
        });

        first.thenCombine(second,(price,rate)-> price*rate).thenAccept(System.out::println).get();

        CompletableFuture.anyOf(first,second).thenAccept(temp ->{
            System.out.println(temp);
        });
    }
}
