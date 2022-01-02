package com.oca.training.udemy.test.test2;


class Parent {
    public String toString() {
        return "Inner ";
    }
}

class Child extends Parent {
    public String toString() {
        return super.toString().concat("Peace!");
    }
}

public class Test8 {
    public static void main(String[] args) {
        System.out.println(10 + 5 + "Output is: ");
        System.out.println(new Child());

        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = "Java";
        String s4 = "Java";
        String s5 = new String("Java");
        String s6 = sb.toString();

        System.out.println(s1 == s2);
        System.out.println(s2==s4);
        System.out.println(s4==s5);
        System.out.println(s1==s6);

        // System.out.println(System.gc())

        System.out.println();

        int score = 60;
        switch (score) {
            default:
                System.out.println("Not a valid score");
           // case score < 70: // Boolean Statments is not allowed
                System.out.println("Failed");
                break;
          //  case score > 70: // Boolean Statments is not allowed
            //    System.out.println("Passed");
               // break;
        }

        byte [] val = new byte[10];
        int [] arr2 = {1,2,3,4,5};
        char [] arr1[] = new char[5][];
        // int [] arr3 = new int[3]{1,2,3}; // Wrong initialization

        int grade = 75;
        if(grade > 60)
            System.out.println("Congratulations");
        System.out.println("You passed");
       //   else // Error
        System.out.println("You failed");


    }
}