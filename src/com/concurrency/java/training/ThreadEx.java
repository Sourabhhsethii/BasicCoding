package com.concurrency.java.training;

public class ThreadEx {

    private static int i;
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            for (i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " i is " + i);
            }
        };
        r.run();
        Thread t1 = new Thread(r,"Work Thread -2");
        t1.start();
        Thread t2 = new Thread(r,"Another Work Thread -1");
        t2.start();

        t1.join();
        System.out.println("main existing");
    }
}
