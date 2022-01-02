package com.oca.training.udemy.test.test1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test17 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        Period period2 = Period.ofMonths(-2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.print(formatter.format(date.minus(period)));
        System.out.println();
        System.out.print(formatter.format(date.minus(period2)));
    }
}