package com.testexception;

import java.io.FileNotFoundException;

public class MyTryException implements AutoCloseable {

    @Override
    public void close() throws Exception {

        System.out.println("Closing MyTryException");
        throw  new FileNotFoundException("[MyTryException] : File Not Found!!");
    }
}
