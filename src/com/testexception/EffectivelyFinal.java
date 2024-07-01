package com.testexception;

import java.io.Closeable;
import java.io.IOException;

public class EffectivelyFinal implements Closeable
{
    @Override
    public void close() throws IOException {

    }
}
