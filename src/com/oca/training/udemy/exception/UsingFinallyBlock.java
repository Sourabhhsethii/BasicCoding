package com.oca.training.udemy.exception;

public class UsingFinallyBlock {

    public static void main(String[] args) {
        try {

          String[] array = new String[5];
        //  array[0] = "John";

           String element = firstToUppercase(array);
            System.out.println("elements= " + element);

        } catch (NullPointerException e){
            System.out.println("NullPointerException");

        } catch (Exception e){
            System.out.println("Exception" + e);
        }
        finally {
            System.out.println("Finally Completed" );
        }
    }

    public  static String firstToUppercase(String[] array){
        return array[0].toUpperCase();
    }
}
