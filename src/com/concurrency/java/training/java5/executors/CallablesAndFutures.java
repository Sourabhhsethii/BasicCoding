package com.concurrency.java.training.java5.executors;

import com.concurrency.java.training.executor.Executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CallablesAndFutures {

    public static void main(String[] args)  {
        var executor = Executors.newFixedThreadPool(2);
        var future = executor.submit(()-> {
            LongTask.simulate();
            return 1;
        });
        System.out.println("Do some more work!!");
        System.out.println(future.isDone());
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

    }
}
