package com.testdatetimezone;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.spi.TimeZoneNameProvider;

public class Zone {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2024,4,5,22,22,22,22, ZoneId.of("US/Eastern"));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.toInstant());
        System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_DATE));
    }
}
