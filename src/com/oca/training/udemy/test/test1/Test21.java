package com.oca.training.udemy.test.test1;


class Message2 {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class Test21 {
    public static void change(Message2 m) { //Line n5
        m = new Message2(); //Line n6
        m.msg = "Happy Holidays!"; //Line n7
    }

    public static void main(String[] args) {
        Message2 obj = new Message2(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4

        int a = 100;
        System.out.println(-a++);
        System.out.println(a);

        do {
            System.out.println(100);
        } while (false);
        System.out.println("Bye");
    }
}