package com.oca.training.udemy.array;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {
        int[] one = new int[3]; // array with 3 elements.
        int[] two = new int[] {10,11,2};

        double[] a = new double[2];
        double[] b = new double[] {1.0,2.2};

        double[] c = new double[4*5/4]; // create empty array with 16 elements
        int[] three = {10,11,12}; // anoumous array
        int[] four = {};

        int[] a1;
        int[] a2;
        int a3[], a4[];

        int[] test1, test2;

        String[] animals = {"Parrot", "Dog", "Cat"};
        String[] myAnimals = animals;
        String[] otherAnimals = {"Parrot", "Dog", "Cat"};

        System.out.println(animals.equals(myAnimals)); // true
        System.out.println(animals == myAnimals); // true
        System.out.println(Arrays.equals(animals,myAnimals)); // true

        System.out.println();

        System.out.println(animals.equals(otherAnimals)); // False
        System.out.println(animals == otherAnimals); // False
        System.out.println(Arrays.equals(animals,otherAnimals));// True

        System.out.println(animals);
        System.out.println(animals.toString());

        System.out.println();

        System.out.println(Arrays.toString(animals));
    }


}
