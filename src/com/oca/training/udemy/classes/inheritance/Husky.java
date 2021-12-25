package com.oca.training.udemy.classes.inheritance;

public class Husky extends Dog {
    public Husky(int age){
        // this();
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {

        System.out.println("Husky Eating");
        // Super method Chaining
        super.eat();
    }
}
