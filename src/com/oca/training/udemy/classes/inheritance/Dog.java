package com.oca.training.udemy.classes.inheritance;

public class Dog extends Animal {
    public Dog(int age){
        super(age);
        System.out.println("Dog");
    }

    @Override
    public void eat() {
        // super.eat();
        System.out.println("Dog Eating");
        super.eat();
    }

    // Cant Override final methods
    public double getAverageWeight(){
        return  super.getAverageWeight() + 20;
    }
}

