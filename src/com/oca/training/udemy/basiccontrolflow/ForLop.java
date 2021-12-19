package com.oca.training.udemy.basiccontrolflow;

public class ForLop {

    public static void main(String[] args) {

        int d = 10;
     //   for(int e = 0; d=0; e<10 || d<10; e++,d--) {} // cant complie

        for(long z=0;z<10;z++){
            System.out.println("long z " + z);
        }

        for(double xy = 0.0; xy<9.5; xy++){
            System.out.println(" double xy " + xy);
        }

        int x =0;
        for(int y=0, z=4; x<5 && y <10;x++,y++){
            System.out.println("y= "+ y);
        }

        System.out.println("x= " + x);


        for(int i =0;i<10;i+=1){
            System.out.print(i + " ");
        }
      //  System.out.println(i + " "); -- error

        System.out.println(); // print new line sign

        int a;
        for (a=0;a<10;a++){
            System.out.print(a + " ");
        }


        System.out.println();
        System.out.println("after for loop a= "+ a);
    }
    // intfinite/endless for loop
   /* for (;;){
        System.out.println("hello");
    }*/

}
