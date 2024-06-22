package com.teststrings;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        var s = "test this example";
        System.out.println(s.length());
        System.out.println(s.charAt(0));

        System.out.println(s.indexOf("t"));
        System.out.println(s.indexOf("t",2));
        System.out.println(s.indexOf('t',3));
        System.out.println(s.indexOf(5));

        System.out.println(s.substring(0,2));
        System.out.println(s.substring(2,3));
        System.out.println(s.substring(2,4));



        System.out.println(s.toLowerCase().toUpperCase());

        String textBlock = """
                 A B      
                B C
                 D E
                """;
        System.out.println("strip ->" + textBlock.strip());
        System.out.println("stripIndent ->" + textBlock.stripIndent());
        System.out.println("trim =" + textBlock.trim());

        String text  = " ABC ";
        String blank = " ";
        System.out.println("text->" + text.trim());
        System.out.println("text->" + text.stripTrailing());
        System.out.println("text->" + text.stripLeading());
        System.out.println("text->" + text.indent(2));
        System.out.println("text-> "+ blank.isEmpty());
        System.out.println("text-> "+ blank.isBlank());

        System.out.println(text.substring(1,2).toLowerCase().length());


        System.out.println(text.charAt(1));

        // Error Cases

        System.out.println(s.substring(2,5));
        System.out.println(s.substring(2,1));
        System.out.println(s.charAt(5));

    }
}
