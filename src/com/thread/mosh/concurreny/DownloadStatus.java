package com.thread.mosh.concurreny;

public class DownloadStatus {
    private int tolalByte;
    private volatile Boolean isDone;

    public int getTolalByte(){
        return tolalByte;
    }

    public void incrementTotalByte(){
        synchronized (this) {
            tolalByte++;
        }
    }

    public synchronized void setTolalByte(int tolalByte) {
        this.tolalByte = tolalByte;
    }

    public  Boolean getDone() {
        return isDone;
    }

    public  void done() {
        isDone = true;
    }
}
