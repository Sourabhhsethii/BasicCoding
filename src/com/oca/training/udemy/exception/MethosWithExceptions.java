package com.oca.training.udemy.exception;

public class MethosWithExceptions {

    public static void main(String[] args) {
        Bear bear = new Bear();

        try {
            bear.eatMeat(2);
            bear.eatPlants(-2);
        } catch (NoMorePlanException e) {
            e.printStackTrace();
            System.out.println("No Planst");
        }
        catch (NoMoreMeatException e) {
            e.printStackTrace();
            System.out.println("Bear is hungry");
        } finally {
            System.out.println("finally");
        }
    }

}
class NoMoreMeatException extends Exception{

}

class NoMorePlanException extends RuntimeException{

}

interface omnivore{
    void eatMeat(int amount) throws NoMoreMeatException;
    void eatPlants(int amount) throws  NoMorePlanException;
}

class Bear implements omnivore{

    @Override
    public void eatMeat(int amount) throws NoMoreMeatException {
        if(amount <=0){
            throw new NoMoreMeatException();
        }
        System.out.println("Eating Meats");
    }

    @Override
    public void eatPlants(int amount) throws NoMorePlanException {
        if(amount<=0){
            throw new NoMorePlanException();
        }

        System.out.println("Eating Plants");
    }
}