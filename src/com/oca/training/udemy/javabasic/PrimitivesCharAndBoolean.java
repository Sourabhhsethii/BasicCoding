package com.oca.training.udemy.javabasic;

public class PrimitivesCharAndBoolean {
    public static void main(String[] args) {
        char ch = 'a';
        // char ch1 = 'ab'; // cant compile too many char literals;
        char ch1 = '1';
        char unicChar = '\u0399'; // upper case greak char. omega charatcter

        char romanNumber = '\u216c'; // roman 50 numeber;

        System.out.println("ch1  " +  ch1);
        System.out.println("unicChar  " +  unicChar);
        System.out.println("romanNumber  " +  romanNumber);

        boolean myBoolean = true;
        boolean myFalseBoolean  = false;

        System.out.println("myBoolean  = "+ myBoolean);
        System.out.println("myBoolean false  = "+ myFalseBoolean );

        /**
         *  boolean true = false; // reversed keyword. // cant complies
         *
         */
    }
}
