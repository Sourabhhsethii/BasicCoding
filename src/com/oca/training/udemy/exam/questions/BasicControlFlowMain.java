package com.oca.training.udemy.exam.questions;

public class BasicControlFlowMain {

    public static void main(String[] args) {

        //Q2
       /* int x = 4;
        long y = x*4 - x++;
        if(y<10) System.out.println("Too Low");
        else System.out.println("Just right");
        else System.out.println("Too High");*/

        // Q3 - infinite loop
    /*    for (int i=0;i<10;){
            i = i++;
            System.out.println("Hello World");
        } */

        /*int x = 1, y=15;
        while x<10*/

    }

    void q1(){

        int m =9,n=1,x=0;
        while (m>n){ // 9>1  | 8>3 | 7>5 | 7>7
            m--; // m = 8 | m = 7 | m = 6
            n +=2; // n = 3 | n = 3+2 = 5 | n = 5 + 2 = 7
            x += m+n; // x = 0+8+3 = 11 | 11 +7+5 = 23 | 23 +6 + 7 = 36- Final
        }
        System.out.println(x); // 36 Ans
    }
}
