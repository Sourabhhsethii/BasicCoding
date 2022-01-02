package com.oca.training.udemy.test.test2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class Vehicle {
    public int getRegistrationNumber() {
        return 1;
    }
}

class Car {
    public int getRegistrationNumber() {
        return 2;
    }
}

public class Test5 {
    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj.getRegistrationNumber());

        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2017-1-1")); // Excpetion At Run Time.
        dates.add(LocalDate.parse("1919-10-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates.removeIf(x -> x.getYear() < 2000);

        System.out.println(dates);
    }
}