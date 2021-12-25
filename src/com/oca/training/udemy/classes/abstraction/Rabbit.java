package com.oca.training.udemy.classes.abstraction;

public class Rabbit extends Animal implements Herbivore,Hop {

    public Rabbit(){
       // super; // does not complie
       // super().setAge(3); // // does not complie

        super();
       // super.setAge(3);
        this.setAge(3);
    }

    public Rabbit(int age){
      //   this(age); // Recursive Calls
        super();
        // this();
        setAge(3);
    }

    @Override
    public void printDetails() {
        System.out.println("Rabit average jump height is= " + Hop.getAverageJumpHeight());
    }

    @Override
    public int getWeight() {
        return 2;
    }
}
