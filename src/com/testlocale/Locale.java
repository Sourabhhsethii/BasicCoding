package com.testlocale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ResourceBundle;
import java.util.stream.Stream;

public class Locale {
    public static void main(String[] args) throws ParseException {

        java.util.Locale.setDefault(java.util.Locale.US);
        System.out.println(java.util.Locale.getDefault());

        var formater = NumberFormat.getCompactNumberInstance(java.util.Locale.ITALIAN, NumberFormat.Style.LONG);
        System.out.println(formater.format(12__02__3020__58));
        var test = Stream.of(NumberFormat.getCompactNumberInstance(),
                NumberFormat.getCompactNumberInstance(java.util.Locale.ITALIAN, NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(java.util.Locale.ITALIAN, NumberFormat.Style.LONG),
                NumberFormat.getNumberInstance(),
                NumberFormat.getNumberInstance(java.util.Locale.CHINA),
                NumberFormat.getCurrencyInstance(java.util.Locale.CHINA),
                NumberFormat.getPercentInstance(java.util.Locale.CHINA)
                );
        test.map(x->x.format(90_0_90_232)).forEach(System.out::println);

        var format = NumberFormat.getCurrencyInstance();
        var var = format.format(12909d);
        System.out.println(var);

        String String = "$123.235";
        var formate = NumberFormat.getCurrencyInstance();
        System.out.println((double) formate.parse(String));

        Integer Integer = 1256;
        System.out.println(Integer);

        Double Double = 12d;
        System.out.println(Double);

        Long Long = 12l;
        System.out.println(Long);

        ResourceBundle resourceBundle = ResourceBundle.getBundle("zoo");
        System.out.println(resourceBundle.getString("a"));


    }
}
