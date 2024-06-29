package com.testNumberFormater;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Properties;
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
        System.out.println(exampleBundle.getString("helloLabel"));

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern(" 'Todays Date is -> 'MMMM dd yyyy 'at' hh ss");
        System.out.println(LocalDateTime.now().format(dateTimeFormatter2));

        String format = exampleBundle.getString("helloByName");
        System.out.println(MessageFormat.format(format,"Sourabh","Shrey"));

        var props = new Properties();
        props.setProperty("abc","test1");
        props.setProperty("def","test2");

        System.out.println(props.getProperty("abc"));
        System.out.println(props.getProperty("def"));
        System.out.println(props.getProperty("uio","test test"));
        System.out.println(props.get("uio"));

        System.out.println(ResourceBundle.getBundle("com.testNumberFormater.ExampleResource").getLocale().getDisplayLanguage().toLowerCase());
        exampleBundle.keySet().stream().forEach(System.out::println);
    }
}
