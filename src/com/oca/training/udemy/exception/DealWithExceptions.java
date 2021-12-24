package com.oca.training.udemy.exception;

public class DealWithExceptions {
    public static void main(String[] args) {
        try {

            int a = 10;
            int b = 0;

            System.out.println(divide(a,b));

        } catch (ArithmeticException e){
            System.out.println("/ by zero");

        } catch (Exception e){
            System.out.println("Exception" + e);
        }
        finally {

        }
    }

    private static int divide(int a, int b){
        return a/b;
    }
}
