package com.oca.training.udemy.classes.inheritance;

public class Eagle extends Bird {

    public int fly(int height){
        System.out.println("Eagle is flying at " + height + " meter");
        return height;
    }


 /*   @Override
    public void eat(int amount) {
      return  amount;
    }*/
}
