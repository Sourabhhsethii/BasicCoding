package com.testdatetimezone;

import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zone {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2024,4,5,22,22,22,22, ZoneId.of("US/Eastern"));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.toInstant());
        System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_DATE));

        Period period = Period.ofMonths(1);
        System.out.println(zonedDateTime.plus(period));

        Duration duration = Duration.ofHours(10);

        int i = 0;
        while (i<30)
        {
            zonedDateTime = zonedDateTime.plus(period);
            zonedDateTime = zonedDateTime.minus(duration);
            System.out.println(zonedDateTime);
        i++;
        }
    }
}
