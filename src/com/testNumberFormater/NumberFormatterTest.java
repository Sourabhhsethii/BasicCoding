package com.testNumberFormater;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class NumberFormatterTest {
    public static void main(String[] args) {

        NumberFormat numberFormat = new DecimalFormat("###,###.##");
        double number = 123.456;
        System.out.println(numberFormat.format(number));
        double number2 = 12345.67890;

        NumberFormat numberFormat2 = new DecimalFormat("###,000,000.0000#");
        System.out.println(numberFormat2.format(number2));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(LocalDateTime.now().format(dateTimeFormatter));
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MMMM dd yyyy 'at' hh ss");
        System.out.println(LocalDateTime.now().format(dateTimeFormatter1));

        // Locale.setDefault(Locale.Category.FORMAT,Locale.CANADA);
        System.out.println(Locale.getDefault());
        Locale locale = new Locale("pl", "PL");
        ResourceBundle exampleBundle = ResourceBundle.getBundle("com.testNumberFormater.ExampleResource", locale);
        System.out.println(exampleBundle.getString("continueButton"));
    }
}
