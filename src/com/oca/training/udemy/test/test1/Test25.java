package com.oca.training.udemy.test.test1;

import java.time.LocalTime;

class Point {
    int x;
    int y;
    void assign(int x, int y) {
        x = this.x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}



public class Test25 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;
        Point p2 = new Point();
        p2.assign(p1.x, p1.y);
        System.out.println(p1.toString() + ";" + p2.toString());

        String str = "ICICINBBRT4";
        System.out.println(str.substring(4,6));

        int i = '5';
        m(i);
        m('5');

        System.out.println("");

        LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM":"";
        System.out.println(amPm);
    }

    private static void m(int x) {
        System.out.println("int version " + x);
    }

    private static void m(char x) {
        System.out.println("char version " + x);
    }
}
