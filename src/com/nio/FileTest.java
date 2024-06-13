package com.nio;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("D:\\Repository\\BasicCoding\\src\\text.txt");

        System.out.println(path.getName(0));
        System.out.println(path.getNameCount());
        System.out.println(path.getFileName());
        System.out.println( path.getParent().getParent().getParent());
        System.out.println( path.getParent().getFileSystem());
        System.out.println( path.getParent().getRoot());

        FileWriter fileWriter = new FileWriter(path.toFile());
        FileReader fileReader = new FileReader(path.toFile());
        try(fileWriter) {
            fileWriter.append(" ");
            fileWriter.append("123");
            fileWriter.close();
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String st;
        while ((st = bufferedReader.readLine())!= null){
            System.out.println(st);
        }

        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = path.toFile();
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.isFile());
        file.deleteOnExit();
        System.out.println(file.getPath());

        File file1 = new File(file.getPath());
        FileWriter fileWriter2 = new FileWriter(file1);
        System.out.println(file1.isFile());
        fileWriter2.append("file 1");
        // fileWriter2.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Type Something to file ");

            try(fileWriter2) {
                while (true) {
                String line = sc.nextLine();
                    fileWriter2.append("\n");
                if(line.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    fileWriter2.append(line);
                }
            }
        }
    }
}
