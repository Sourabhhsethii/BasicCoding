package com.oca.training.udemy.classes.abstraction;

public interface Herbivore {
    default void eatPlants(){

        System.out.println("Eating Plants");
    }

    default public int getRequiredPlanAmount(){
        return 0;
    }
   /* default public int getRequiredPlanAmount();*/
}
