package com.java.certification.practice;

import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.sql.SQLException;
import java.util.prefs.BackingStoreException;
import java.util.zip.DataFormatException;

public class Exceptions {


    public static void main(String[] args) {
       /* test();*/
        test2();
        test3();
    }

    /**
     * All are checked Exception Example.
     * @throws CertificateException
     * @throws BackingStoreException
     * @throws PrinterException
     * @throws DataFormatException
     * @throws SQLException
     * @throws IOException
     */
    public static void test() throws CertificateException, BackingStoreException, PrinterException, DataFormatException, SQLException, IOException {

    }

    /**
     *  These are unchecked exception
     * @throws IllegalArgumentException
     * @throws ClassCastException
     */
    public static void test2() throws IllegalArgumentException, ClassCastException
    {}

    public void openIt(String name) throws FileNotFoundException {
        if(Math.random() > 0.5){
            throw new FileNotFoundException();
        }
    }

    public void opener() throws FileNotFoundException {
        openIt("MyFile.txt");
    }

    /**
     * Nested try catch block!
     */
    public static void test3(){
        try {
            try {
                if(Math.random()>0.5) throw new FileNotFoundException();
                System.out.println("Success!");
            } finally {
                System.out.println("All done here!!");
            }
            System.out.println("Trundling along");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Aha");
        } finally {
            System.out.println("Really done");
        }
        System.out.println("Continuing");
    }

    void sql() throws Exception { throw new SQLException();}
    void rt2() { throw new ArrayIndexOutOfBoundsException();}
    void rt() throws RuntimeException {}
   /* void  io2() { throw new FileNotFoundException();}*/
    void io() throws IOException {
        failer();
    }

    class MyException extends IOException {}

    void failer() throws IOException {
        throw new MyException();
    }
}
