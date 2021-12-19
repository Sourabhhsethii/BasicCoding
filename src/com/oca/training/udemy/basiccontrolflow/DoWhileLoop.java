package com.oca.training.udemy.basiccontrolflow;

public class DoWhileLoop {

    public static void main(String[] args) {
        int a = 0;
        do{
            a++;
        } while (false);

        System.out.println("a= "+ a);
        while (a == 1){
            a++;
        }
        System.out.println("a= "+ a);

        // does not compile
       /* while(false){
            a++;
        }*/

        int x = 20;
        while (x > 10) x--;
        System.out.println("x= "+ x);

        int x2= 20;
        do x2--;
        while (x2 > 10);
        System.out.println("x2= "+ x2);

        int y = 10;
        int z = 5;
        while (y < 20)
            y++;
            z+=2;
            y+=10;

            // y = 30;
        System.out.println("x = "+ x + "y = "+ y + "z =  "+ z);

        int number = 10;
        while (number > 10){
            number--;
        }


        /** infinited loop **/
        do{
            number--;
            // number = 9     ----------- 9
            while (number>5) {
                number += 1;
                // number = 10 --------- 10
            }
        }while (number < 10);

        System.out.println("number= " + number);
        /** infinited loop **/

    }
}
