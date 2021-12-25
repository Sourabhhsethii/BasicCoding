package com.oca.training.udemy.classes.abstraction;

public interface Carnivore {
    default void eatMeat(){
        System.out.println("Eating Meat");
    }
}
