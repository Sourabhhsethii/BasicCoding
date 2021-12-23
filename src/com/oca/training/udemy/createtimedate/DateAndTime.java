package com.oca.training.udemy.createtimedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {

        /*
        New in Classes in Java 8
         */

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate localDate = LocalDate.of(2017, Month.APRIL,01);
        System.out.println(localDate);

        System.out.println();

        LocalTime localtime = LocalTime.of(10,30);
        System.out.println(localtime);

        System.out.println();

        System.out.println(LocalDateTime.of(localDate,localtime));

        //before java 8
        System.out.println(new Date());

        Calendar calendar = Calendar.getInstance();
        calendar.set(2007,Calendar.JANUARY, 1);
        Date jan = calendar.getTime();
        System.out.println(jan);

    }
}
