package com.recursion;
/*
 With recursion
 e.g 8! = 8 * 7!
 => n * F(n-1)
 */
    public class Factorial {


        public static int fact(int number){
            // Base Condition
            if(number == 1){
                return number;
            }

            // Work & recursion call;
            return number * fact(number-1);


        }

    public static void main( String args[]){

            System.out.println(fact(3));

    }

    }
