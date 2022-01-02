package com.oca.training.udemy.test.test2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Test11 {
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
      //  System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
        add(10.0, null);

        LocalDate date = LocalDate.parse("1980-03-16");
        System.out.println(date.minusYears(-5));

        List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));

        System.out.println(days.contains(new StringBuilder("Sunday")));

        if(days.contains(new StringBuilder("Sunday"))) {
            days.add(new StringBuilder("Wednesday"));
        }

        System.out.println(days.size());

        System.out.println();

        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate eventDate = LocalDate.of(2018, 1, 1);
        boolean flag1 = eventDate.isAfter(newYear);
        boolean flag2 = newYear.isBefore(eventDate);
        System.out.println(flag1 + ":" + flag2);

        Period period = Period.ofYears(0).ofDays(10);
        System.out.println(period);

        LocalDate date2 = LocalDate.parse("2018-01-01");
        System.out.println(date2);

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(new Integer(100));

        System.out.println(list);

        LocalDate date3 = LocalDate.parse("2000-01-01");
        Period period4 = Period.ofYears(-3000).ofDays(-50);
        System.out.println(date3.plus(period4));

        System.out.println();

            String fruit = "mango";
            switch (fruit) {
                case "Apple":
                    System.out.println("APPLE");
                case "Mango":
                    System.out.println("MANGO");
                case "Banana":
                    System.out.println("BANANA");
                    break;
                default:
                    System.out.println("ANY FRUIT WILL DO");

        }
    }
}
