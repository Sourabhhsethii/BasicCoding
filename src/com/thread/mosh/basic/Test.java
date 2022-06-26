package com.thread.mosh.basic;

/**
 * Error while executing same critcal section by different threads.
 */
public class Test implements Runnable  {
    public void run(){
        System.out.println("Thread Started");
    }
    public static void main(String[] args) {
        Test testing = new Test();
        Thread th1 = new Thread(testing);
        th1.start(); // executing one Critical Section
        Thread th2 = new Thread(testing);
        th1.start(); // This thread wil try to execute same CS again hence result into error.
    }
}