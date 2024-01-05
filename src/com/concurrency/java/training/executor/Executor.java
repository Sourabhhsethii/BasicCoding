package com.concurrency.java.training.executor;

import java.util.concurrent.*;

public class Executor {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(()->{
            System.out.println("Test");
            System.out.println( Thread.currentThread() + " is  blocked");
            try {
                Thread.sleep(10_00);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Main Thread is not blocked");
        Future task =executorService.submit(()-> {
            System.out.println(  "Task 2 :"+Thread.currentThread() + " is blocked");
            if(Thread.currentThread().isInterrupted()) {
                System.out.println(  "Task 2 :"+Thread.currentThread() + " is isInterrupted");
            }
            return 2;
        });
        if(!task.isCancelled()) {
            System.out.println(task.get());
        }
        executorService.shutdown();

    }
}
