package com.oca.training.udemy.classes.abstraction;

public interface Walk {
    default int getSpeed(){
        return 5;
    }
}
