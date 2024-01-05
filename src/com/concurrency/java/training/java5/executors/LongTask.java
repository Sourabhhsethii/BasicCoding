package com.concurrency.java.training.java5.executors;

public class LongTask {
    public static void simulate() {
        try {
            Thread.sleep(30_00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
