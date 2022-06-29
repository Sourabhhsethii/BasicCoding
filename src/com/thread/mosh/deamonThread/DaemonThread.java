package com.thread.mosh.deamonThread;

public class DaemonThread {

    public static void sleep(long mills){
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Runnable runnable = () -> {
          while (true){
              sleep(1000);
              System.out.println("Running");
          }
        };

        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        sleep(3100);
    }
}
