package com.testrecord;

public record Record(int hello, int world) {

    Record(int hello){
        this(hello,2);
    }

    public Record {
        hello = -1;
    }
}
