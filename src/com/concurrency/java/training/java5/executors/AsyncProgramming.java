package com.concurrency.java.training.java5.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * Completable Future!!
 */
public class AsyncProgramming {
    public static void main(String[] args) {
        Runtime.getRuntime().availableProcessors();
        Runnable task1 = ()-> System.out.println("a");
        Callable task2 = ()-> "1";
        Callable task3 = ()-> "2";
        var future = CompletableFuture.completedFuture(task2);
        try {
            System.out.println(future.get().call());
            System.out.println(CompletableFuture.completedFuture(task3).get().call());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
