package com.thread;

/**
 * Sync between threads.
 */
public class SyncThread {
    public static void main(String[] args) {
        WorkerSync ws = new WorkerSync();
        Thread th1 = new Thread(ws);
        Thread th2 = new Thread(ws);
        th1.start();
        th2.start();
    }
}

class WorkerSync implements Runnable {
    // Critical Section of the code.
    public void run(){
        String lockObj = "object one";
        synchronized (this){
            System.out.println("Thread " + Thread.currentThread().getName() + " entered second block");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
