package com.thread;

/**
 * No Sync between threads.
 */
public class Testing {
    public static void main(String[] args) {
        Worker obj = new Worker();
        // Same object is passed to the two different objects.
        // There is no sync between two thread.
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.start();
        t2.start();
    }
}

class Worker implements Runnable {
    // Critical Section of the code.
    public void run(){
        System.out.println("Thread " + Thread.currentThread().getName() + " entered second block");
    }
}
