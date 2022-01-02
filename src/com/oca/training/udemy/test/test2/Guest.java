package com.oca.training.udemy.test.test2;

//Guest.java
class Message3 {
    public static void main(String [] args) {
        System.out.println("Welcome " + args[0] + "!");
    }
}

public class Guest {
    public static void main(String [] args) {
        Message3.main(args);

        int [] arr3 = {3, 2, 1};
        for(int i : arr3) {
            System.out.println(arr3[i]);
        }

        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (int i = 0; i < arr.length; i++) { //Line n1
            for (int j = 0; j < arr[i].length; j++) { //Line n2
                switch (arr[i][j]) { //Line n3
                    case "2":
                    case "4":
                    case "6":
                        break; //Line n4
                    default:
                        continue; //Line n5
                }
                System.out.print(arr[i][j]); //Line n6
            }
        }
    }
}