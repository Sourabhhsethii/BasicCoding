package com.format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class Format {
    public static void main(String[] args) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        Number percent = 10_00_00;

        System.out.println(Locale.getDefault());
        Locale.setDefault(Locale.ITALIAN);
        System.out.println(numberFormat.format(percent));

        System.out.println(Locale.getDefault());

        NumberFormat numberFormat1 = NumberFormat.getCompactNumberInstance();
        System.out.println(numberFormat1.format(10_10));
        System.out.println(numberFormat1.getRoundingMode());

        System.out.println(Locale.getAvailableLocales().length);
        Arrays.stream(Locale.getAvailableLocales()).sequential().forEach(System.out::println);

        System.out.printf("test");

        NumberFormat numberFormat3 = NumberFormat.getCompactNumberInstance(Locale.ITALIAN, NumberFormat.Style.LONG);
        Number number = 10_0000L;
        System.out.println(numberFormat3.format(number));

    }
}
