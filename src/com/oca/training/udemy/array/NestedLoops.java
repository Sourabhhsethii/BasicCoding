package com.oca.training.udemy.array;

import java.util.Arrays;

public class NestedLoops {

    public static void main(String[] args) {
        for (int hours =0; hours <=24; hours++){
            for (int minutes = 0; minutes < 60; minutes++){
            //    System.out.println(hours + " : " + minutes);
            }
        }
        int[][] myArray = {
                {1,2,3
                },
                {4,5,6},
                {7,8,9}
        };

        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));

        OUTER:
        for (int[] rowArray: myArray){
            INNER:
            for (int i=0; i<rowArray.length;i++){
                if(rowArray[i] %2 == 0){
                   // break OUTER;
                    // break INNER;
                   //  continue INNER;
                   // continue OUTER;
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int x = 10;
        while (x > 0){
            do {
                // 1.) execute until x = 5;
                // 3.) x = 3
                // 5.) x = 1
                x -= 1;
            }while (x>5);
            // 2.) x-- -> x = 4
            // 4.) x-- -> x = 2
            // 6.) x-- -> x = 0
            x--;

            // print 4
            // print 2
            // print 0
            System.out.println(x);
        }

    }
}
