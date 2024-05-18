package com.java.certification.practice;

public class SWITCH {

    public static void main(String[] args) {
        int x  = (int) (3* Math.random());
        switch (x){
            case 0 :
                System.out.println("it's zero");
            case 1 :
                System.out.println("it's less than 2");
                break;
            default:
                System.out.println("Seems like 2");
                break;

           }

       /*    final char f =1;
            int offset =0;
           switch (f) {
               case 65_536 : // 65_536 is too big than char.
                   System.out.println("BIG");
                   break;
               case offset+1: // offset is not final value;
                   System.out.println("Off+1");
               default:
                   System.out.println("Something else");
           }*/

        int j =99;
        switch (j){
            case 98,99 -> System.out.println("99");
            case 100 -> System.out.println("100");
            case 200 -> System.out.println("200");
        }

        String m ="99";
        switch (m){
            case "98","99" -> {
                System.out.println("99");
                m+=100;
            }
            case "100" -> System.out.println("100");
            case "200" -> System.out.println("200");
        }
        System.out.println(m);
    }
}
