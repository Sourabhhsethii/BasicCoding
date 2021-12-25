package com.oca.training.udemy.classes.abstraction;

public class Cat extends Animal implements Run {
    public Cat(int age) {
        super(age);
    }

    @Override
    public int getWeight() {
        return 5;
    }

    @Override
    public int getSpeed() {
        return Run.super.getSpeed();
    }
}
