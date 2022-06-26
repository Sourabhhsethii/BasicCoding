package com.thread.mosh.basic;

public class Main {

    public static void main(String[] args) {
        // Get The active Threads
        System.out.println(Thread.activeCount());
        // Get the Avaliable Processors
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
