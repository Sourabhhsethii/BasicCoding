package com.oca.training.udemy.strings;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder mystring =  new StringBuilder();

        for(char c ='a'; c<='z';c++){
            mystring.append(c);
        }
        System.out.println(mystring);

        // With String Builder
        StringBuilder sb = new StringBuilder();
        for(char c='a'; c<='z'; c++){
            sb.append(c); // add char to string builder, reuses string builer without creating string
        }

        System.out.println(sb);

        StringBuilder  builder = new StringBuilder("start");
        builder.append("-middle"); // "start-middle"

        StringBuilder anotherBuilder = builder.append("-end");

        System.out.println();
        System.out.println(builder);
        System.out.println(anotherBuilder);

        System.out.println(builder == anotherBuilder);
        System.out.println(System.identityHashCode(builder));
        System.out.println(System.identityHashCode(anotherBuilder));

        System.out.println();

        StringBuilder myBuilder =new StringBuilder();
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());

        myBuilder = new StringBuilder(100);
        System.out.println("size= " + myBuilder.length());
        System.out.println("capcity= " +myBuilder.capacity());

        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java ");
        b =  b.append("is").append(" so ").append("cool");
        System.out.println(a);
        System.out.println(b);

    }
}
