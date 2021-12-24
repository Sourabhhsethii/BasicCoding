package com.oca.training.udemy.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LamdaExpression {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false,true));
        animals.add(new Animal("rabiit", true,false));
        animals.add(new Animal("dog", true, true));

       //  print(animals, new CheckcanJump()); // while using pridicate - it can give errors.
       // print(animals,animal -> animal.canJump());
       // print(animals, (Animal animal) -> !animal.canSwim() );

        print(animals, (Animal ani) -> {
            System.out.println("Checking Animal = " + ani.getType());
            return ani.canSwim();
        });


        Animal fish = animals.get(0);
        Animal rabbit = animals.get(1);
        Animal dog = animals.get(2);

        print(fish,rabbit,((first, second) ->  first.canJump() && second.canJump()));
        print(fish,dog,((first, second) ->  first.canSwim() && second.canSwim()));

        List<String> name =  new ArrayList<>();
        name.add("John");
        name.add("Anthony");
        name.add("Jimmy");
        name.add("Timmy");

        System.out.println("name= " + name);

       //  name.removeIf(str -> str.charAt(0) == 'J');
        name.removeIf((String str) ->{
            return str.charAt(0) == 'J';
        });
        System.out.println("afte filter name= " +  name);

    }

    private static void print(List<Animal> animals, Predicate<Animal> filter){
        for (Animal animal: animals){
            if(filter.test(animal)){
                System.out.println("Animal : - " + animal.getType());
            }
        }
    }

    private static void print(Animal first, Animal second, AnotherCheck check){
        System.out.println(check.check(first,second));
    }
}

class Animal {
    private String type;
    private boolean canJump;
    private boolean canSwing;

    public Animal(String type, boolean canJump, boolean canSwing) {
        this.type = type;
        this.canJump = canJump;
        this.canSwing = canSwing;
    }

    public boolean canJump(){
        return canJump;
    }

    public boolean canSwim(){
        return canSwing;
    }

    public String getType(){
        return type;
    }
}

/**
 * Functional Interface with ony one method inside it.
 */
interface CheckAnimal{
    boolean check(Animal animal);

}

interface AnotherCheck{
    boolean check(Animal first, Animal second);
}

class CheckcanJump implements  CheckAnimal{

    @Override
    public boolean check(Animal animal) {
        return animal.canJump();
    }
}
