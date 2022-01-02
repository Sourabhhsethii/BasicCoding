package com.oca.training.udemy.test.test1;

import java.time.LocalDate;

public class Test22 {


    public static void main(String[] args) {
        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        System.out.println(s1 == s2);

        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);

        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
            case -128:
                System.out.println("var is 200");
                break;
            default:
                System.out.println("In default");
        }

        long [] args2 = new long[]{12345789101l, 50};
        args2[0] = 5;
        args2[1] = 10;
        System.out.println("[" + args2[0] + ", " + args2[1] + "]");
    }

}
