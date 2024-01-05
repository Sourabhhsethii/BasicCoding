package com.concurrency.java.training.java5.executors;

import com.concurrency.java.training.ThreadEx;

import java.util.concurrent.*;

public class RunningCodeOnCompletion {

    public static void main(String[] args) {
        var test =   new ThreadPoolExecutor(12, 15, 10000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100,true));
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        var future = CompletableFuture.supplyAsync(()->1,new ForkJoinPool()
              );
        future.thenRun(()-> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done!");
        }
    );
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
