package com.oca.training.udemy.classes.abstraction;

public class Bird extends Animal {

    public void fly(){
        System.out.println("Bird is flying");
    }

    public void eat(int amount){
        System.out.println("Bird is eating " + amount + " units of food");
    }

    @Override
    public int getWeight() {
        return 2 ;
    }
}
