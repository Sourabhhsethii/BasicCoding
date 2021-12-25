package com.oca.training.udemy.classes.abstraction;

public class Main {

    public static void main(String[] args) {
      //  Animal animal = new Animal(); //Animal' is abstract; cannot be instantiated

        Husky husky = new Husky(5);
        husky.getTailLength();
        husky.setName("Husky");
        husky.run(10);
        husky.printDetails();

        System.out.println("-------------------");

        Bear bear = new Bear();
        bear.setName("Jimmy");
        bear.setAge(10);
        bear.eatMeat();
        bear.printDetails();

        System.out.println("---------Rabbit----------");

        Rabbit rabbit = new Rabbit();
        rabbit.eatPlants();
        rabbit.printDetails();

        System.out.println("----------Cat---------");

        Cat cat = new Cat(3);
        int speed = cat.getSpeed();
        System.out.println("cat speed is " + speed);

    }
}
