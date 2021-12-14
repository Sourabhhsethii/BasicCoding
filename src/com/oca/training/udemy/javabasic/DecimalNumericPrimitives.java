package com.oca.training.udemy.javabasic;

public class DecimalNumericPrimitives {
    public static void main(String[] args) {
        float myNumber = 2_5.4f; // add f to number to provide it float Primitives
        double before = 1_2.2_5;

        // double before = 10_.25; // does not compile.  _underscore is not allowed in just before decimals point.
        // double after = 10._25; // does not compile.  _underscore is not allowed in just after decimals point.
        // double after = _10.25; // does not compile.  _underscore is not allowed in start.
        // double after = 10.25_; // does not compile.  _underscore is not allowed in end.
        System.out.println(before);

        double myDouble = 2.54;
        double myDouble2 = 2.54F;
        double anotherDouble = 2.45d; // d can be used for double it is optional.
        double scientific = 5.111000124E2;
        double scientific2 = 500.0000124;
        System.out.println(scientific);
        System.out.println(scientific2);

        double hecPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number;
        System.out.println("hexPi= " + hecPi);
    }


}
