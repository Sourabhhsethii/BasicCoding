package com.testexception;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Exception Examples ");

        try {
            new Exception();
        } catch (Exception exception){
            System.out.println(exception);
        }

        try {
            new RuntimeException();
        } catch (RuntimeException e){
            System.out.println(e);
        }

        try(var test = new MyTryException();
            var test2 = new MyTryException2();) {
            System.out.println("Started Try Block");

            System.out.println("Closing Try Block");
            throw new NullPointerException();
            // UnReachable Block after this...
        } catch (Exception e) {
            System.out.println("Exception -> " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Tested Completed!!");
        }

    }
}
