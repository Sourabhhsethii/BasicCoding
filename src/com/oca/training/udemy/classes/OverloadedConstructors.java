package com.oca.training.udemy.classes;

class DogClass{

    private String name;
    private String breed;
    private double weight;

    public DogClass(String name){
     /*   this.name = name;
        breed = "husky";
        weight = 30.0;*/

     //  Dog(name, "husky"); // Doesnot Complie
      //  new DogClass(name,  "husky");  // complies but does not do what we want
      //   this.name = name; // this() -> need to first in the constructors body.
        this(name,"husky"); // Constructor Channing
    }

    public DogClass(String name, String breed){
    /*    this.name = name;
        this.breed = breed;*/
        this(name,breed,30.0);  // Constructor Channing
    }

    public DogClass(String name, String breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public  void print(){
        System.out.println(name + " " + breed + " "+ weight);
    }
}
public class OverloadedConstructors {
    public static void main(String[] args) {
        DogClass dog1 = new DogClass("Jimmy");

        dog1.print();

        DogClass dog2 = new DogClass("Anthony", "shepard");
        dog2.print();

        DogClass dog3 = new DogClass("Rex", "German Shepard",10.);
        dog3.print();

    }
}
