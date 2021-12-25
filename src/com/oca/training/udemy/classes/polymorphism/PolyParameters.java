package com.oca.training.udemy.classes.polymorphism;

import com.oca.training.udemy.classes.abstraction.Animal;
import com.oca.training.udemy.classes.abstraction.Cat;
import com.oca.training.udemy.classes.abstraction.Husky;
import com.oca.training.udemy.classes.abstraction.Rabbit;

public class PolyParameters {

    public static void main(String[] args) {

        System.out.println("----");

        Husky husky = new Husky(3);
        printDetails(husky);

        System.out.println("----");

        Rabbit rabbit = new Rabbit();
        printDetails(rabbit);

        System.out.println("----");

        Cat cat = new Cat(2);
        cat.setName("Tom");
        printDetails(cat);

        System.out.println("----");

        Animal rex = createAnimal("Rex",4);
        printDetails(rex);

        System.out.println("----");

        Animal kitty = new Cat(2);
        printDetails(kitty);

    }

    public static void printDetails(Animal animal){
        animal.printDetails();
    }

    public static Animal createAnimal(String name, int age){
        if(name.equals("Rex")){
            Animal animal = new Husky(age);
            animal.setName(name);
            return animal;
        } else if(name.equals("Kitty")){
            Cat animal = new Cat(age);
            animal.setName(name);
            return animal;
        }

        Rabbit rabbit = new Rabbit(age);
        rabbit.setName(name);
        return rabbit;
    }
}
