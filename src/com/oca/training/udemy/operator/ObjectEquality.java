package com.oca.training.udemy.operator;

public class ObjectEquality {
    public static void main(String[] args) {
        // comparing objects
        Integer myInteger = 127;
        Integer myAnotherInterger = 127;
        System.out.println(myAnotherInterger == myInteger);
        System.out.println("128 == 128 " +  (128 == 128));

        System.out.println("myInteger " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInterger " + System.identityHashCode(myAnotherInterger));


        myAnotherInterger = 128;
        myInteger = 128;
        System.out.println("myInteger= " + myInteger);
        System.out.println("myAnotherInt9erger= " + myAnotherInterger);
        System.out.println(myInteger == myAnotherInterger);

        Integer int1 = 1;
        Integer int2 = 1;
        Integer int3 = 1;


        System.out.println("int1--int2 " + (int1==int2));
        System.out.println("int1--int3 " + (int1==int3));
        System.out.println("int2--int3 " + (int2==int3));

        System.out.println();

        System.out.println("int1.equals(int2 " + int1.equals(int2));
        System.out.println("int1.equals(int2 " + int1.equals(int3));
        System.out.println("int1.equals(int2 " + int2.equals(int3));

        System.out.println();

        System.out.println("int1 hash= "+ System.identityHashCode(int1));
        System.out.println("int2 hash= "+ System.identityHashCode(int2));
        System.out.println("int3 hash= "+ System.identityHashCode(int3));
    }
}
