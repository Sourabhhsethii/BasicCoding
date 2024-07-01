package com.testexception;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exception Examples ");
        var effectivelyFinal  = new EffectivelyFinal();
        // effectivelyFinal is effectively final.\
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

        try(effectivelyFinal;
            var test = new MyTryException();
            var test2 = new MyTryException2(); ) {
            System.out.println("Started Try Block");
            // uncomment below line to check that below lines will not work.
            // System.exit(0);
            System.out.println("Closing Try Block");
            throw new NullPointerException();
            // UnReachable Block after this...

        } catch (Exception e) {
            for (var th : e.getSuppressed())
                System.out.println(th.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Tested Completed!!");
        }
        // uncomment below line; it will show you the example about what EffectivelyFinal
        // effectivelyFinal = null;


        /**
         *  Output
         *
         *  Exception Examples
         * Started Try Block
         * Closing Try Block
         * [MyTryException2] Closing MyTryException2
         * Closing MyTryException
         * File Not Found!!
         * [MyTryException] : File Not Found!!
         * Tested Completed!!
         * java.lang.NullPointerException
         * 	at com.testexception.Main.main(Main.java:26)
         * 	Suppressed: java.io.FileNotFoundException: File Not Found!!
         * 		at com.testexception.MyTryException2.close(MyTryException2.java:12)
         * 		at com.testexception.Main.main(Main.java:21)
         * 	Suppressed: java.io.FileNotFoundException: [MyTryException] : File Not Found!!
         * 		at com.testexception.MyTryException.close(MyTryException.java:11)
         * 		at com.testexception.Main.main(Main.java:21)
         *
         */

    }
}
