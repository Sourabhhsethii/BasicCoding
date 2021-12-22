package com.oca.training.udemy.methods;

import java.util.Arrays;

public class MethodsWithVarArgs {

    public void jump1(int... number){

    }

    public void jump2(int start , int... number){

    }

    public  void jump5(int[] start, int[] numbers){

    }

    public static void jump(int start, int...numbers ){
        System.out.println("start=== " + start + " numbers.length= "+ numbers.length);
        System.out.println("numbers->" + Arrays.toString(numbers));
    }

    public static void run(int... numbers){
        for (int number: numbers){
            System.out.println("numbers= " + number);
        }

        System.out.println(Arrays.toString(numbers));
    }


    // Vararg parameter must be the last in the list
  /*  public void jump3(int... number , int start){

    }*/

    // Vararg parameter must be the last in the list
 /*   public void jump4(int... start, int... number){

    }*/

    public static void main(String[] args) {
        jump(1,2,5);
        jump(3,3,2,1);

        run();
        run(11,22,33,44,55,66,77,88,99);
    }
}
