package com.oca.training.udemy.classes.abstraction;

public interface Run extends Walk {

    default int getSpeed(){
        return 10;
    }
}
