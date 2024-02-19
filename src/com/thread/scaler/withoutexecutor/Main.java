package com.thread.scaler.withoutexecutor;

public class Main {

    public static void main(String[] args) {

       /* for(int i=0;i<100;i++){
            Thread t = new Thread(new PrintHello());
            t.start();
        }*/


       /* ArrayList<Thread> threads   = new ArrayList<>();
        for(int i=0;i<100;i++){
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
            threads.add(t);

            if(i == 40){
                System.out.println("Debug all threads");
            }

            if(i == 90){
                System.out.println("Debug all threads");
            }
        }*/

        String str = "Hello";
        for (int i = 0; i < str.length(); i++) {
           Thread t = new Thread(new CharPrinter(str.charAt(i)));
            t.start();
        }

    }
}
