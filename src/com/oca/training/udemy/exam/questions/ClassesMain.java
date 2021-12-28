package com.oca.training.udemy.exam.questions;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public  class ClassesMain {

    public static void main(String[] args) {

       // LocalDate date = LocalDate.of(2020, Month.APRIL,40); // Runtime Error
       // System.out.println(date.getYear() + " " + date.getDayOfMonth() + " " + date.getDayOfMonth() + " " + date.getMonth());

     /*   LocalDateTime d = LocalDateTime.of(2015,5,10,11,22,33);
        Period p = Period.of(1,2,3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));*/
        LocalDateTime d = LocalDateTime.of(2017,5,10,11,22,33);
        Period p = Period.ofDays(1).ofYears(2).ofMonths(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(d.format(f));

    }
}

interface Herbivore {
/*     int amount = 10;
     public  static void eatPlan();
     public int chew(){
         return 23;
     }*/
}

