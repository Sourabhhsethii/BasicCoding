package com.thread.mosh.wayofMultiThreading;

public class RunnableWithLamba {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("thread name -> " + threadName);
            System.out.println("My Thread running");
            System.out.println("My Thread finish");
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
