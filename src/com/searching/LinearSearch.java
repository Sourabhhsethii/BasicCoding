package com.searching;

import java.util.Scanner;

/*
Implement Liner search, check each element from index 0 till, match is found and return Match Found.

Example
Enter Number of elements of array
3
Enter Element1 :
1
Enter Element2 :
2
Enter Element3 :
3
Enter Number to search
2
Found
 */
public class LinearSearch {

    static String  search( int[] num, int numberToBeSearch){

        for (int i=0;i<num.length;i++){
            if(num[i] ==  numberToBeSearch){
                return "Found";
            }
        }

        return "Match Not Found";
    }

    public static void main(String[] args) {
        int n,searchNumber;

        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter Element " + (i+1) + " : ");
            num[i] = input.nextInt();
        }

        System.out.println("Enter Number to search");
        searchNumber = input.nextInt();
        System.out.println(search(num,searchNumber));

    }
}
