package com.thread.jenkov.wayofMultiThreading;

public class ExtendsThread {

    public static class MyThread extends Thread {
        public void run(){
            System.out.println("My Thread running");
            System.out.println("My Thread finish");
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

    }
}
