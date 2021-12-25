package com.oca.training.udemy.classes.inheritance.main;

import com.oca.training.udemy.classes.inheritance.Dog;
import com.oca.training.udemy.classes.inheritance.Husky;

public class MainInhertitance {
    public static void main(String[] args) {

        Husky husky = new Husky(25);
        husky.setName("Husky");
        husky.printDetails();

        System.out.println("-------------");

        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();

    }
}
