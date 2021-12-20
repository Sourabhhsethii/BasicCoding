package com.oca.training.udemy.array;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] names = {"Jimmy", "John", "Tom", "Anthony"};
        for(int i=0;i<names.length;i++){
            System.out.println("name = " + names[i]);
        }

        System.out.println();

        for (String name: names){
            System.out.println("name = " + name);
        }

        System.out.println();

        for(String name: names){
            name = name + " " + name;
        }
        for(String name: names){
            System.out.println("name = " + name);
        }

        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };

        for (StringBuilder str: builders){
            System.out.println(str);
        }

        System.out.println();

        for (StringBuilder str: builders){
            str.append("123");
        }

        for (StringBuilder str: builders){
            System.out.println(str);
        }

        // Below code does not compile
        /*String  pets = "Parrot";
        for (String pet: pets){

        }*/

        // Below code does not compile - Incompitable type
        /*for(int name: names){

        }*/

        System.out.println();


        String  pets = "Parrot";
        for (char c: pets.toCharArray()){
            System.out.print(c + " ");
        }

    }
}
