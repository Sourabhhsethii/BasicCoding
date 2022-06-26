package com.thread.mosh;

import com.thread.mosh.concurreny.DownloadStatus;

public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask() {
        this.status = new DownloadStatus();
    }

    @Override
    public void run() {
        System.out.println("Downloading a File" + Thread.currentThread().getName());

        for (int i = 0; i < 10_000; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            System.out.println("Downloading byte " + i);
            status.incrementTotalByte();
        }
        System.out.println("Download Complete: " + Thread.currentThread().getName());
    }


    public DownloadStatus getStatus() {
        return status;
    }
}
