package com.subarray;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2024,10,2);
        LocalTime localTime = LocalTime.of(23,22,22,22);
        var zoneID = ZoneId.of("US/Eastern");
        System.out.println(zoneID);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate,localTime,zoneID);
        System.out.println(zonedDateTime);

        System.out.println(localDate.plusYears(1));
        System.out.println(localDate.minusYears(2));

        System.out.println(localTime.plusMinutes(2L));
        System.out.println(localTime.plusMinutes(10L));

        System.out.println(zonedDateTime.toInstant());
        System.out.println(Instant.now());
        System.out.println(ZonedDateTime.ofInstant(Instant.now(),zoneID));

        var month = Period.ofMonths(1).plusMonths(2).plusYears(2);
        System.out.println(month);
        var duration = Duration.ofDays(1).plusMinutes(20);
        System.out.println(duration);

    }
}
