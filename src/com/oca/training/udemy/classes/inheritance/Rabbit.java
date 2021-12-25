package com.oca.training.udemy.classes.inheritance;

public class Rabbit extends Animal {

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
}
