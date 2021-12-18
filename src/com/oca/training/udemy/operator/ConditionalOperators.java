package com.oca.training.udemy.operator;

public class ConditionalOperators {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b; // false
        boolean e = a || b; // true

        System.out.println("d = " + d + " e= "+ e);

        int f = 4;
        boolean g = false && (f++ < 4); // (f++ < 4) is never execute (short-circuiting)
        boolean h = (f-- == 4) && !g; // true && !g, f = 3;
        // true && true -> true

        System.out.println("f = " + f ); // 3
        System.out.println("g = " + g ); // false;
        System.out.println("h = " + h ); // true; !g -> true

        int myInt = 3;
        int anotherint = 4;
        boolean myBoolean = (myInt <=3) && (anotherint-- == 4) || (myInt++ == 4);
        // (myInt<3) -> true
        // (anotherint-- == 4) // 4 ==4 -> true
        // (myInt++ == 4) --> not evaluated.

        System.out.println("myInt= " + myInt); //3
        System.out.println("anotherInr= " + anotherint); //3
        System.out.println("myBoolean = " + myBoolean);// true

        boolean x = true, z = false;
        int y = 20;
        x = (y != 10) ^ (z = false); // z = false sets z to false;
        // true ^ false -> true
        System.out.println(x + " , " + y + " , " + z);   // true , 20 , false
    }

}
