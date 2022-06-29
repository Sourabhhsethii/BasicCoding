package com.thread.mosh.wayofMultiThreading;

public class RunnableInterfaceAnonymousClass {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Thread running");
                System.out.println("My Thread finish");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
