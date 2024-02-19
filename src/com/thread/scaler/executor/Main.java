package com.thread.scaler.executor;

import com.concurrency.java.training.executor.Executor;

import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        var executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i <= 20; i++) {
            executor.execute(new NumberPrinter(i));

            if(i == 20){
                System.out.println("Debug all threads " + Thread.currentThread().getName());
            }
        }
        executor.shutdown();
    }
}
