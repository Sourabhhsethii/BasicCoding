package com.concurrency;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new CustomThreadCreation("Fives :", 5);
        Thread v = new CustomThreadCreation("Sevens: ", 7);

        t.start();
        v.start();

        Thread.sleep(3000);
        t.interrupt();
        System.out.println("\n ALL threads interrupted, Terminating");
    }
}
