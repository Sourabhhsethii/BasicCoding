package com.oca.training.udemy.exam.questions;

public class ArraysMain {
    public static void main(String[] args) {


        int count =0;
        ROW_LOOP:
        for (int row =1; row <=3;row++){
            for(int col=1;col<=2;col++){
                if(row * col % 2 == 0)
                    continue ROW_LOOP;
                    count++;

            }
        }
        System.out.println(count);

        int[][] scores = new int[5][];
        Object[][][] cubies = new Object[3][0][5];
       // String beans[] = new beans[6]; // Error
       //  int[][] types = new int[]; // Error
       //  int[][] java = new int[][]; // Dimesntion not declared.

        java.util.Date[] dates[] = new java.util.Date[2][];

        char[] c = new char[2];
        int length = c.length;

        Character[] ch = new Character[2];
        int len = ch.length;


        int[][] array1 = {{},{},{}};
       // int[][] array2 = new array() // error.

        int[] list = {8,10};
        for (int x: list){
            System.out.println(x + ",");
        break;
        }

        int number1  = 120;
        switch (number1){
            default :
                System.out.println("default");
            case 0 :
                System.out.println("case1");
            // case (10*2-20) : // dublicate label.
                System.out.println("case2");
                break;
        }
    }
}
