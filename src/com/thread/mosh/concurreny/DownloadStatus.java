package com.thread.mosh.concurreny;

public class DownloadStatus {
    private int tolalByte;

    public int getTolalByte(){
        return tolalByte;
    }

    public void incrementTotalByte(){
        tolalByte++;
    }
}
