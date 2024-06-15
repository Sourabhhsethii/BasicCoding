package com.files;

import java.io.*;

public class WorkingWithFiles {

    public static void main(String[] args) throws IOException {


        /**
         * Buffer Reader from File Reader
         */
        var read = new BufferedReader(new FileReader("D:\\Repository\\BasicCoding\\src\\com\\files\\zoo.txt"));
        String lines  = read.readLine();
        System.out.println(lines);
        read.close();

        /**
         * Buffer Reader from Input Stream
         */
        var read2 = new BufferedReader(new InputStreamReader(System.in));
        String lines2  = read2.readLine();
        System.out.println(lines2);

        var writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write("written");
        writer.newLine();
        writer.close();

        try(
            var reader = new FileReader("D:\\Repository\\BasicCoding\\src\\com\\files\\zoo.txt");
        ){
            var bufferReader = new BufferedReader(reader);
            System.out.println(bufferReader.markSupported());

            System.out.print( bufferReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
