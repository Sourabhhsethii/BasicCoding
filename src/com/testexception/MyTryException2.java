package com.testexception;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyTryException2 implements Closeable {
    @Override
    public void close() throws IOException {

        System.out.println("[MyTryException2] Closing MyTryException2");
        throw  new FileNotFoundException("File Not Found!!");
    }
}
