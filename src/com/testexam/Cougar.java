package com.testexam;

public class Cougar implements HasTail{
    public static void main(String[] args) {
        var puma = new Puma() {

            @Override
            public String getTailLength() {
                return "1";
            }
        };
        System.out.println(puma.getTailLength());
    }

    @Override
    public String getTailLength() {
        return null;
    }
}
