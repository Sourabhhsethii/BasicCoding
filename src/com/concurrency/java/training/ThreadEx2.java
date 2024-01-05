package com.concurrency.java.training;

public class ThreadEx2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            System.out.println("Hello Threading Work!");
        });
        t1.start();
        System.out.println("Thread Launched");
        t1.join();
    }
}
