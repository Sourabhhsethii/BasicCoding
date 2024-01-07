package com.concurrency.java.training.java5.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompleteableFuture {

    public static void main(String[] args) {
        var first = CompletableFuture.supplyAsync(()->1);
        var second = CompletableFuture.supplyAsync(()->2);
        var third = CompletableFuture.supplyAsync(()->3);

        var all =CompletableFuture.allOf(first,second,third);
        try {
            all.thenRun(()->{
                System.out.println("All task completed!!");
            });
            System.out.println(first.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
