package com.thread.mosh.wayofMultiThreading;

public class RunnableWithLamba {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("My Thread running");
            System.out.println("My Thread finish");
        };

        Thread thread = new Thread(runnable);
        thread.start();;
    }
}
