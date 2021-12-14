package com.oca.training.udemy.javabasic;

/**
 *
 */
public class VariableScope {
  static int myNewInt = 5;

    public static void main(String[] args) {
        int myLocalInt = 10;
        {
            int myOtherInt = 20;
            int anotherInt = 40;
            System.out.println("myOtherInt = " +  myOtherInt);
            System.out.println("inCodeBlock myLocalInt = " +  myOtherInt);
        }

        //   System.out.println("myOtherInt= " +  myOtherInt);
        System.out.println("myLocalInt= " +  myLocalInt);
        System.out.println("myNewInt= " +  myNewInt);

        int myOtherInt = 30;
        int anotherInt = 50;
        System.out.println("myOtherInt= " +  myOtherInt);
        System.out.println("anotherInt= " +  anotherInt);
    }

    public static void myMethod(){

        // Below code will not compile, it is just for confusion

      /*  {
            int myOtherInt = 20;
            {
                int myOtherInt = 20;
            }
        } */

    }

}
