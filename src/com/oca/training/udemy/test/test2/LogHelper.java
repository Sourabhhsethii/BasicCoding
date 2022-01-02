package com.oca.training.udemy.test.test2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

abstract class Helper {
    int num = 100;
    String operation = null;

     abstract void help();

    void log() {
        System.out.println("Helper-log");
    }
}

public class LogHelper extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";

    void help() {
        System.out.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String [] args) {
        new LogHelper().help();
        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4


        char c = 'Z';
        long l = 100_00l;
        int i = 9______2______0__1;
        float f = 2.02f;
        double d = 10_0.3_5000000d;
        l = c + i;
        f = c * l * i * f;
        f = l + i + c;
        i = (int)d;
        f = (long)d;

        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.add(0, "List");

        System.out.println(list);
        String s1 = "OcA";
        String s2 = "oCa";
        System.out.println(s1.equals(s2));

        LocalDate d1 = LocalDate.parse("1999-09-09");
        LocalDate d2 = LocalDate.parse("1999-09-09");
        LocalDate d3 = LocalDate.of(1999, 9, 9);
        LocalDate d4 = LocalDate.of(1999, 9, 9);
        System.out.println((d1.equals(d2)) + ":" + (d2.equals(d3)) + ":" + (d3.equals(d4)));

        String [][] fruits = {{"apple", "mango"}, {"orange", "grape"}};
        for (String[] str: fruits){
            for(String fruit: str){
                System.out.print(fruit + " ");
            }
        }


    }

    public static void change(Message m) { //Line n5
        m.msg = "Happy Holidays!"; //Line n6
    }
}