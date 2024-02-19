package com.thread.scaler.withoutexecutor;

public class CharPrinter implements Runnable {

    private char c;

    CharPrinter(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-> Char is " + c + " " );
    }
}
