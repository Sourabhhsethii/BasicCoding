package com.oca.training.udemy.methods;

public class Static {
    private String name = "Static";

    public static void one(){

    }

    public static void two(){
        one();
        // two(); // recursion
      //   three(); // From static method cant use non static method as well as variable
      //  System.out.println(name); // From static method cant use non static method as well as variable
    }

    public void three(){
        one();
        two();
     //   three(); // Stack Overflow as it is recursive calls
        System.out.println(name);
    }

    public static void main(String[] args) {
        Static.one();
        one();
        two();
        // three(); // cant call non static method directly from main method.
        Static abc = new Static();
        abc.three();

        new Static().three();
    }

}
