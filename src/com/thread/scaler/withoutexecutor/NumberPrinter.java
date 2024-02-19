package com.thread.scaler.withoutexecutor;

public class NumberPrinter implements Runnable {

    private int number;

    NumberPrinter(int number){
        this.number = number;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Number is " + number + " from " + Thread.currentThread().getName());
    }
}
