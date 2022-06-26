package com.thread.mosh;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());


        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
