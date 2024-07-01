package com.testexception;

public class MyTryException implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing MyTryException");
    }
}
