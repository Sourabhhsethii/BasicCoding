package com.thread.mosh.volatileExp;

import com.thread.mosh.concurreny.DownloadStatus;

public class DownloadFileTask implements Runnable {

    private DownloadStatus status;


    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a File" + Thread.currentThread().getName());

        for (int i = 0; i < 1_000_000; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            System.out.println("Downloading byte " + i);
            status.incrementTotalByte();
        }
        status.done();

        System.out.println("Download Complete: " + Thread.currentThread().getName());
    }


    public DownloadStatus getStatus() {
        return status;
    }
}
