package com.thread.mosh.concurreny;

import com.thread.mosh.DownloadFileTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Race Condition Demo.
 */
public class ThreadDemo {

    public static void main(String[] args) {
        var status = new DownloadStatus();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
                var thread = new Thread(new DownloadFileTask(status));
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

        System.out.println(status.getTolalByte());
    }
}
