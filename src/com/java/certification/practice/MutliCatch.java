package com.java.certification.practice;

import javax.sound.midi.MidiUnavailableException;
import java.io.*;
import java.sql.SQLException;
import java.util.Scanner;

public class MutliCatch {

    public static void main(String[] args) throws Exception {

        try{
            if(Math.random() > 0.5) throw new FileNotFoundException();
            if(Math.random() > 0.5) throw new MidiUnavailableException();
        } catch (FileNotFoundException | MidiUnavailableException exception){
            System.out.println(exception);
        }

        try(FileWriter fw = new FileWriter("test.txt") ; FileReader fr = new FileReader("test.txt")) {
            fw.append("test File");
            fw.close();
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }


        } catch (IOException io){
            System.out.println(io);
        }
        io();
        io2();
    }

    static public void io() throws SQLException, IOException   {
        try{
            if(Math.random() > 0.5) throw new FileNotFoundException();
            if(Math.random() > 0.5) throw  new SQLException();

        } catch (SQLException | IOException e) {
            throw e;
        }
    }

    static public void io2() throws Exception {
        try{
            if(Math.random() > 0.5) throw new FileNotFoundException();
            if(Math.random() > 0.5) throw  new SQLException();

        } catch (SQLException | IOException e) {
            Exception f =e;
           throw f;
        }
    }
}
