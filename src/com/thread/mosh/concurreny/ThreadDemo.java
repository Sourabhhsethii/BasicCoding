package com.thread.mosh.concurreny;

import com.thread.mosh.DownloadFileTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Race Condition Demo.
 */
public class ThreadDemo {

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

                var task = new DownloadFileTask();
                tasks.add(task);
                var thread = new Thread(task);
                thread.start();
                threads.add(thread);
        }
        for (var thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       var totalByte =  tasks.stream()
                .map(t-> t.getStatus().getTolalByte())
                .reduce(Integer::sum);
        System.out.println(totalByte);
    }
}
