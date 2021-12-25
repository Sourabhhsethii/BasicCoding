package com.oca.training.udemy.classes.inheritance;

public class Animal {

    private int age;
    private String name;


    public Animal( int age){
        System.out.println("Animal");
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails(){
        System.out.println("name =" +  this.name + " age = " + this.age);
    }
}
