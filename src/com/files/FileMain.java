package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileMain {

    public static void main(String[] args) throws IOException {
        try(var in = new FileInputStream("D:\\Repository\\BasicCoding\\src\\com\\files\\zoo.txt")){
            System.out.println("Found File");
            System.out.println((char) in.read());
        } catch (FileNotFoundException ex){
            System.out.println("File Not Found!!!");
        }
    }
}
