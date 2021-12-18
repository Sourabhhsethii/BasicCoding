package com.oca.training.udemy.operator;

public class CharacterArithmetic {

    public static void main(String[] args) {
        // char 0 - 65535
        char myCharA = 'A';
        char myCharNum = '1';

        System.out.println("myCharA= " + myCharA);
        System.out.println("myCharA isLetter= " + Character.isLetter(myCharA));
        System.out.println("myCharA IsDigit= " + Character.isDigit(myCharA));

        System.out.println();

        System.out.println("myCharNum= " + myCharNum);
        System.out.println("myCharNum isLetter= " + Character.isLetter(myCharNum));
        System.out.println("myCharNum IsDigit= " + Character.isDigit(myCharNum));

        // exam Exmaples
        char letter = 65; // A
        int myInt = letter + 3;
        char myNewLetter = (char)myInt;

        System.out.println();

        System.out.println("letter " + letter);
        System.out.println("myInt " + myInt);
        System.out.println("myNewLetter " + myNewLetter);

        char myChar = 65; // A
        char newChar = (char) (myChar + 1 ); // 66 -> B
        boolean b = newChar == 'B'; // true
        boolean c = newChar++ < 'D'; // 67 < D-> 68 -> true

        System.out.println("myChar= " + myChar);
        System.out.println("mnewChar = " + newChar);
        System.out.println("b= " + b);
        System.out.println("c= " + c);


    }
}
