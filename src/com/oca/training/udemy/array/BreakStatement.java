package com.oca.training.udemy.array;

public class BreakStatement {
    public static void main(String[] args) {
//        myLabel :
//        int[] myArray = {1,2,3};

        myLable : {
            int[] myArray = {1,2,3};
        }

        String[] animals =  {"dog", "cat", "lizard","bird", "snake"};

        for (String animal : animals){
            System.out.println(animal);
            break;
        }

        System.out.println();

        MY_LOOP :  for (String animal: animals){
            if(animal.equals("cat")){
                break MY_LOOP;
            }
            System.out.println(animal);
        }

        animals: for(String animal: animals){
            if(animal.equals("cat")){
                break animals;
            }
        }

        for (String animal: animals){
            if(animal.equals("lizard")){
                break;
            }
        }

        System.out.println();
        int index = 0;
        while (index < animals.length){
            String animal = animals[index];
            if(animals.equals("lizard")){
                break;
            }
            System.out.println(animal);
            index++;
        }

    }
}
