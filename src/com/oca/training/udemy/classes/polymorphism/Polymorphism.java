package com.oca.training.udemy.classes.polymorphism;

import com.oca.training.udemy.classes.abstraction.*;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {

    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Rex");

        Dog dog = husky; // another reference to Husky object in memory
        dog.printDetails();

        HasTail hasTail = husky;

        System.out.println("tail Lenght = " + hasTail.getTailLength());


        CanRun canRun = husky; // another reference to same object
        canRun.run(5);

        Animal animal = husky; // another reference to same object
        animal.printDetails();

        Object object = husky; // another reference to same object

      //  husky.printName();
        Husky myDog = (Husky) animal; // another reference to same object - Down Casting
        myDog.printDetails();

        System.out.println("CAt");

        Animal cat = new Cat(2);
        Cat mycat = (Cat) cat;

        // Bear bear = (Bear)"test"; // not related in heirechary
        // Dog newDog = (Dog) cat; // cannot be cast to class = because of the different side of heirechary

        // Bird is not polymorphic
        Bird bird = new Bird();
        Object birdObject = bird;


        List<String> list = new ArrayList<>();

        Animal rabbit = new Rabbit();
        rabbit.printDetails();
    }
}
