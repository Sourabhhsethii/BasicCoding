package com.oca.training.udemy.createtimedate;

import java.time.*;

public class UsingPeriod {
    public static void main(String[] args) {
        LocalDate  start = LocalDate.of(2017, Month.JANUARY,1);
        LocalDate  end = LocalDate.of(2017, Month.APRIL,30);

        Period period = Period.ofDays(5);

       // start.toEpochDay(); // number of days since Januray 1 1970

        cleanAnimalCage(start,end);
        System.out.println();
        System.out.println();
        cleanAnimalCage(start,end);

        System.out.println(start.plus(period));
        System.out.println(LocalDateTime.now().plus(period));
      //  System.out.println(LocalTime.now().plus(period)); // unsypported unit day for time.

        // Period yaerAndMonth = Period.ofYears(1).ofMoths(1);

        Period yaerAndMonth = Period.of(1,1,0);
        System.out.println(yaerAndMonth);
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        while (start.isBefore(end)){
            System.out.println("Need to clean the acge on date=" + start);
            start = start.plus(period);
        }
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
    while (start.isBefore(end)){
        System.out.println("Need to clean the acge on date=" + start);
        start = start.plusMonths(1);
    }
    }
}
