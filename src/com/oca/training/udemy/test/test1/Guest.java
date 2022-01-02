package com.oca.training.udemy.test.test1;

//Guest.java
class Message {
    static void main(String [] args) {
        System.out.println("Welcome " + args[2] + "!");
    }
}

public class Guest {
    public static void main(String [] args) {
        Message.main(args);
    }
}