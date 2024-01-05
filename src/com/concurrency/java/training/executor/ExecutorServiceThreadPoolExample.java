package com.concurrency.java.training.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + " : Executed");
        });

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + " : Executed");
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + " : Executed");
        });

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + " : Executed");
        });


        executorService.shutdown();
        System.out.println("Main");

        System.out.println(executorService.isTerminated());


    }
}
