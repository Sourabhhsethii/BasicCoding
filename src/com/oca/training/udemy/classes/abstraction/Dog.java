package com.oca.training.udemy.classes.abstraction;

public  abstract class Dog extends Animal implements HasTail, CanRun {
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

    @Override
    public int getWeight() {
        return 0;
    }

//    @Override
//    public int getTailLength() {
//        return 20;
//    }

}

