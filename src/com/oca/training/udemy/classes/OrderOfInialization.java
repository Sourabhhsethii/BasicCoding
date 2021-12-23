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

public class OrderOfInialization {



    public static void main(String[] args) {

        Example ex = new Example();

    }
}
