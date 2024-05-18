package com.java.certification.practice;

public class Labels {
    public static void main(String[] args) {
        talkative :
        System.out.println("Hello");

        blockOne :
        {
            System.out.println("test");
        }

        blockone : {
            System.out.println("Scope Of this block is different than other block");
        }

        blockone : {
            System.out.println("Scope Of this block is different than other block");
        }

       /* blockOne : {
            blockOne: {

            }
        }*/

        outer : for(int x =0,z=0; x<5; System.out.println(),x++){
            for(var y =0 ;y <5;y++){
                if(y == x) continue  outer;
                System.out.printf("x=%d, y=%d :", x, y);
            }
        }
        skip : {
            if(Math.random()>0.5) break skip;
            System.out.println("that was a small number");
        }
        System.out.println("finished");

    }
}
