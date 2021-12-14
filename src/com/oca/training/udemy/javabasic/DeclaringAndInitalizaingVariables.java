package com.oca.training.udemy.javabasic;

/**
 *
 */
public class DeclaringAndInitalizaingVariables {
    public static void main(String[] args) {
        int myNumber; // declaration;

      //   System.out.println("myNumber" + myNumber ); // as myNumber is  not initialized yet
        myNumber = 10; // initialized

        System.out.println("myNumber " + myNumber );

        // one line
        double myDouble = 7.50;
        System.out.println("myDouble " + myDouble);

        float myFloat1, myFloat2, myFloat3;
        float myFloat4; float myFloat5;

        float myFloat6 = 5f, myfloat7 = 10f, myFloat8;
        boolean b1, b2;

        // double b1, b2; // does not compile

        int i1;
        int i2;
       //  int i3; i4; // does not compile

        // int int = 10; // doesnot compile
        char Char;
        char CHaR;
        char CaHr;

        float okFloat;
        double $Ok2Double1;
        float __OkButNotNice$_123;

        // illegal examples
        // double 3Dpoint;
        // double 2ABC;

        //double my@Streat;
        //float *$coffee;

        // float double;
        // double public;
    }
}
