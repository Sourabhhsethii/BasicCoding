package com.concurrency.java.training.java5.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorDemo {
    public static void main(String[] args) {
        // Executors class. It is factor method provide different instance of the class
        var executor = Executors.newFixedThreadPool(2);

        try {
            System.out.println(executor.getClass().getName());
            for (int i = 0; i < 10; i++) {

                executor.submit(()->{
                    System.out.println(Thread.currentThread().getName());
                });
            }
        } finally {
            executor.shutdown();
        }

    }
}
