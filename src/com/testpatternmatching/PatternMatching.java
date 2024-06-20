package com.testpatternmatching;

import com.java.certification.practice.Streams;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class PatternMatching {
    public static void main(String[] args) {

        Integer val = 123;
        if(val instanceof Integer){
            System.out.println("Its integer as well");
        }

        // Same Type errror
        /*if(val instanceof Integer data){

        }*/

        Number val2 = 123;
        if(val2 instanceof Stream data)
            System.out.println(data);

        // Flow Scoping
        printIntegerOrNumberGreaterThan5(1);


    }

   static void printIntegerOrNumberGreaterThan5(Number number){

        // Short Circuting
        if(number instanceof Integer data && data.compareTo(5)>0){

        }

        // incase of or, it will through error.
        /*if(number instanceof Integer data || data.compareTo(5)>0){

        }*/

        if(number instanceof Integer data)
            System.out.println(data.intValue());
        // System.out.println(data.intValue()); //error

        if(!(number instanceof Integer data))
            return;
        System.out.println("Still in Scope-> " + data.intValue());



        if(!(number instanceof Integer data2))
            return;
        else
            System.out.println(data2.intValue());

        if(number instanceof Integer data3)
            System.out.println(data3.intValue());
        else
            return;

        System.out.println(data3.intValue());


    }
}
