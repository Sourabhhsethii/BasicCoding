package com.oca.training.udemy.classes.abstraction;

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

    @Override
    public int getDefaultTailLength() {
        return 0;
    }

    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public void run(int speed) {
        System.out.println("Husky running at speed = " + speed);
    }
}
