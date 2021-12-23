package com.oca.training.udemy.classes;

class Example{
    private String name = "dog";

    {
        System.out.println(name);
    }

    private  static  int count =0;

    static {
        System.out.println(count);
    }

    {
        count+= 12;
        System.out.println(count);
    }

    public Example(){
        System.out.println("constructor");
    }
}

class Demo {

    static {
        add(2);
    }
    static void  add(int number){
        System.out.print(number + "  ");
    }
    Demo(){
        add(5);
    }
    static {
        add(4);
    }

    static {
        add(6);
    }

    static {
        new Demo();
    }

    {
        add(8);
    }
}

public class OrderOfInialization {



    public static void main(String[] args) {

      //  Example ex = new Example();
        new Demo();

    }
}
