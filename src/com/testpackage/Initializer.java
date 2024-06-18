package com.testpackage;
/*package com.testpackage;*/
public class Initializer {

    static int a = 10;
    int b = 20;

    {
        a = 30;
        b = 50;
        System.out.println("Basic Initializer");
    }

    static {
        a = 20;
      /*  b = 20;*/
        System.out.println("Static Basic Initializer");
    }

     Initializer() {
        a = 100;
        b = 60;
        System.out.println("Constructors");
    }

    public static void main(String[] args) {
        Initializer initializer = new Initializer();
        System.out.println(Initializer.a);
        System.out.println(initializer.b);

        /**
         * Literals
         */
        int b = 1;
        long c = 1l;
        long  d = 0xBC1DDDDD;
        long e = 0b10101010110101010101;
        short f = 67;
        System.out.println((char) f);

        /**
         *  Text Block
         */

                String test = """
        1
        2 "/s \t s \s s
        3 \s
        4 \t \n //////////// \s \\ \\ \\ \\
        5
        """;
        System.out.println(test);

      /*  int g;
        hello(g);*/
    }

    static void hello(int y){

    }

}
