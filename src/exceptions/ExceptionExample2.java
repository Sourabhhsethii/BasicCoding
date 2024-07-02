package exceptions;

import java.io.IOException;

public class ExceptionExample2 {
    public static void main(String[] args) throws IOException {
        try {

           // System.exit(0);
            ExceptionExample2.exTest();

           // System.exit(0);
        } catch (RuntimeException es){
            System.out.println("y");
           throw  new IOException();
        } finally {
            System.out.println("Final");
            throw  new IOException();
        }


    }

    static void exTest() throws IOException {
        throw new IOException();
    }
}

