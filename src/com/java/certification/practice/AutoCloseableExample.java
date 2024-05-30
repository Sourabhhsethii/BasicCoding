package com.java.certification.practice;

class MyResource implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Closing   .... ");
    }
}

public class AutoCloseableExample {
    public static void main(String[] args) {
        System.out.println("Starting");
        try(MyResource mr = new MyResource()) {
            System.out.println("Using Resources");
        }
        System.out.println("Ending");
    }
}
