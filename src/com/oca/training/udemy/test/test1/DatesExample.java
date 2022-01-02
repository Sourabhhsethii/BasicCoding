package com.oca.training.udemy.test.test1;

import java.time.LocalDate;
import java.time.LocalTime;

public class DatesExample {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;

        System.out.println(time); // MAX : 23:59:59:99999999 (Nine 9's)
        System.out.println(date.atTime(time));
    }
}