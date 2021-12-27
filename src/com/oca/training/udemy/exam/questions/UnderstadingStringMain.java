package com.oca.training.udemy.exam.questions;

public class UnderstadingStringMain {
    public static void main(String[] args) {

        //Q1
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc"); //aaa -> abbaa // abbaccca
        System.out.println(sb);

        //Q2
        StringBuilder c = new StringBuilder("rumble");
        c.append(4).deleteCharAt(3).delete(3,c.length()-1);

        //Q3
       /* StringBuilder d = "rumble"; // Error
        c.append(4).deleteCharAt(3).delete(3,c.length()-1);*/

       /* String letters = "abcdef";
        System.out.println(letters.length()); // 6
        System.out.println(letters.charAt(3)); // d
        System.out.println(letters.charAt(6)); // Exception is thrown*/

        String number = "012345678";
        System.out.println(number.substring(1,3)); //12
        System.out.println(number.substring(7,7)); // Blank line
        System.out.println(number.substring(7)); // 78

        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1,2).length(); // 0 + 1 = 1 total =1
        total += letters.substring(6,6).length(); // (total= 1) + 0 = 1
        total += letters.substring(6,5).length(); // (total= 1) + 1 = 2 // Exception is thrown
        System.out.println(total);

    }
}
