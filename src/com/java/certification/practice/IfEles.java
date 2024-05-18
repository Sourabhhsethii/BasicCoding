package com.java.certification.practice;

public class IfEles {

    public static void main(String[] args) {
       /*
         This code is unreachable code because final int x - 10; is constant
         and, constant can not be used in while loop
        final int x =10;
        while(x >50){
            System.out.println("very big number");
        } */

        if(false)
            System.out.println("Not so");
        else
            System.out.println("Seems so");
    }
}
