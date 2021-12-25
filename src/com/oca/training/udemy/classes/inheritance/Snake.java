package com.oca.training.udemy.classes.inheritance;

public class Snake extends Reptile {

    @Override
    protected boolean haslegs() {
        return false;
    }

    @Override
     double getWeight() {
        return 10.0;
    }
}
