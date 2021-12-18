package com.oca.training.udemy.operator;

public class CompoundAssingmentOperators {
    public static void main(String[] args) {
        int x = 2;
        int z = 3;
        x = x * z; // simple assignement
        x *=z; // short form of x = x * z;

        System.out.println("x "+  x);

        // int a += 5; // error - does not complie
        // without explicit cast

        long a = 10;
        int b = 4;
        //   b = b * a; // does not complie
        // b = (int ) (b * a);

        b *=a; // short for b
        System.out.println("b " + b);

        long c = 4;
        long d = (c = 2); // shorter form of c =2; long d = c;
        System.out.println("c= " + c + " d " + d );

        long e = 3;
        long f;
        long h = 1;

        long i = e + 3 *(f=3) - (h -=2); // -> h = h-2 = 1-2 = -1
        // f =3;
        // e + 3 * 3 - (-1) --> also sets h=-1 // h = h-2;
        // e + 3 * 3 + 1;
        // 3 + 9 + 1;
        // 13

        System.out.println("e= "+  e);
        System.out.println("f= "+  f);
        System.out.println("h= "+  h);
        System.out.println("i= "+  i);

    }
}
