package com.thread.mosh.wayofMultiThreading;

public class ImplementRunnableInterface {

    public static void main(String[] args) {
        Thread thread  = new Thread(new MyRunnable());
        thread.start();
    }

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("My Thread running");
            System.out.println("My Thread finish");
        }
    }
}
