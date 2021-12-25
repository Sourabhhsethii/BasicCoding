package com.oca.training.udemy.classes.abstraction;

public class Bear extends Animal implements Omnivore {

    @Override
    public int getWeight() {
        return 2000;
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear Eating Plants");
    }

    @Override
    public void eatPlants() {

    }
}
