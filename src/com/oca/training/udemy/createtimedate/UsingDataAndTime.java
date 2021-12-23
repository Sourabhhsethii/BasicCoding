package com.oca.training.udemy.createtimedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class UsingDataAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2030, Month.JANUARY,10);
        System.out.println(date);
        date = date.plusDays(5).plusMonths(2);
        System.out.println(date);

        System.out.println();

        LocalTime time = LocalTime.of(10,30);
        System.out.println(time);
        time = time.plusHours(2).plusMinutes(20);
        System.out.println(time);

        System.out.println();

        LocalDateTime localDateTime = LocalDateTime.of(date,time);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(1);

        System.out.println(localDateTime);

        // before java 8
        Date myDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(myDate);
        cal.set(Calendar.DATE,1);
        cal.set(Calendar.MONTH,2);
        myDate = cal.getTime();
        System.out.println(myDate);

        // exam tricks
        LocalDate ld = LocalDate.of(2010, Month.APRIL,1);
        ld.plusDays(10); // return result is ignored.
        System.out.println(ld);

        // ld.plusMinutes(); // Can complie - does not exist

        LocalTime lt = LocalTime.of(12,45);
       // lt.addDays(); // Can complie - does not exist

        LocalDateTime ldt = LocalDateTime.of(ld,lt);

    }
}
