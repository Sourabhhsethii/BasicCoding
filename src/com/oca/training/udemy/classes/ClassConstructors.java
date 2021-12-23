package com.oca.training.udemy.classes;

class Dog {
    private  String color;

    public Dog(){

    }
    public Dog(String color){
        System.out.println("Hello Dog Constructors Called!!!");
        this.color = color;
    }

    public void printColour(){
        System.out.println("colour= " + color);
    }

}

class Cat {
    private String colour;
    private int height;
    private int length;

    public Cat(int length, int theHeight){

        this.length = length;
        height = theHeight;
        colour = "white";
    }

    public void printInfo(){
        System.out.println("Cat lenght= "+ length + " height " + height + " colour = " +colour);
    }
}
public class ClassConstructors {
    public static void main(String[] args) {
        Dog dog = new Dog("Black");
        dog.printColour();
        Cat cat = new Cat(10,12);
        cat.printInfo();
        }
    }

