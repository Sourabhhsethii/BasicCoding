package com.thread.mosh.volatileExp;

import com.thread.mosh.concurreny.DownloadStatus;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        var status = new DownloadStatus();
        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(()-> {
            while (!status.getDone()){
                System.out.println(status.getTolalByte());
            }
        });
        thread1.start();
        thread2.start();
    }
}
