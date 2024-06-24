package com.testgenric;

public interface TestGenrics<T> {
    public <U extends Object,W extends Object> U concat(U t, W w);
}
