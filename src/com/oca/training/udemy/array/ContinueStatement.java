package com.oca.training.udemy.array;

public class ContinueStatement {
    public static void main(String[] args) {
        String[] animals  = {"dog", "cat", "lizard", "bird", "snake"};

        MyLoop: for (String animal: animals){
            if(animal.equals("cat")){
                continue MyLoop;
            }
            System.out.println(animal);
        }

        animal:
        for(String animal: animals){
            if(animal.equals("cat")){
                continue animal;
            }

            System.out.println(animal);
        }

        System.out.println();
        System.out.println();

        for (String animal: animals){
            if(animal.equals("lizard") || animal.equals("cat")){
                continue;
            }
            System.out.println(animal);
        }

        System.out.println();

        int index =0 ;
        while (index< animals.length){
            String  animal = animals[index];
            index++;
            if(animal.equals("lizard")){
                continue;
            }

            System.out.println(animal);

        }
    }
}
