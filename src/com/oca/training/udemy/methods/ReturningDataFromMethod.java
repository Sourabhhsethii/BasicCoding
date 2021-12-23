package com.oca.training.udemy.methods;

public class ReturningDataFromMethod {
    public static void main(String[] args) {

        int number =2;
        String word = "zyx";

       // number(number); // 2

        number = number(number); // 3

        word = word(word); //xyza

        System.out.println(number + word); //3xyza
    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String word(String word) {
        word += "a";
        return word;
    }
}
