package com.testexception;

import java.io.Closeable;
import java.io.IOException;

public class MyTryException2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing MyTryException2");
    }
}
