package com.oca.training.udemy.basiccontrolflow;

import java.util.Random;

public class SwitchStatments {

    public static void main(String[] args) {
        int dayOfWeek =0;

        switch (dayOfWeek){
            case 0 :
                System.out.println("Monday");
                break;
            case 1 :
                System.out.println("Tuesday");
               break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3 :
                System.out.println("Thurday");
                break;
            case 4 :
                System.out.println("Friday");
            default:
                System.out.println("weekend");
            //    break;
        }

        Random rand = new Random();
        int c = rand.nextInt(26) + 'a'; // adding offset to produce lower case letter
        System.out.println((char) c + ", "+ c + ": ");

        switch (c){
            case 'a' :
            case 'e':
            case 'i':
            case 'u':
                    System.out.println("Vowel");
                    break;
            case 'y' :
            case 'w':
                            System.out.println(" sometimes a vowel");
                            break;
            default:
                System.out.println("Constant");
        }

        int x =4;
        switch (x){
            case 4:
            case 'y': // it can cast from while
            //  case true: // error
           // case "test": // error
        }

    }
}
