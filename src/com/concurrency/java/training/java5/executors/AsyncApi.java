package com.concurrency.java.training.java5.executors;

public class AsyncApi {

    public static void main(String[] args) {
        var service = new MailService();
        service.sendAsync();
        System.out.println("Hello World!!");
        try {
            Thread.sleep(50_00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
