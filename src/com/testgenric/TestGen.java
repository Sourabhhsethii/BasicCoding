package com.testgenric;

public class TestGen<U> implements TestGenrics<U> {

    public static void main(String[] args) {
        TestGen<Double> test = new TestGen<>();
        String t = test.concat("12","12");
        System.out.println(Integer.parseInt(t));

        RecordGenTest record = new RecordGenTest("test",1);
        System.out.println(record);
    }

    @Override
    public <U extends Object,W extends Object> U concat(U t, W w) {
        return (U) (t.toString() + w.toString());
    }
}
