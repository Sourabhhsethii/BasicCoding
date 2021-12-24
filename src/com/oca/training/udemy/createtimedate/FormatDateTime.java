package com.oca.training.udemy.createtimedate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormatDateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2010, Month.APRIL,15);
        LocalTime time = LocalTime.of(11,22,33);
        LocalDateTime dateTime = LocalDateTime.of(date,time);

        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        DateTimeFormatter shortTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumtTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        System.out.println(shortTimeFormatter.format(dateTime));
        System.out.println(shortTimeFormatter.format(date));
        System.out.println(mediumtTimeFormatter.format(time));

        System.out.println();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");

        System.out.println(formatter.format(dateTime));

        System.out.println("Before Java 8");

        SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
        System.out.println(sf.format(new Date()));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(dtf.format(dateTime));
        System.out.println(dtf.format(date));
       // System.out.println(dtf.format(time));
    }
}
