package com.hashtable;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * The Airline Boarding-Pass Problem
 * Description
 * In an airline ticketing system, they issue unique boarding passes to each of the passengers of a particular flight. Each boarding pass is scanned at the gate to verify that it has not already been used. The system looks into the database and checks whether any boarding pass is already in use. It assumes that the person who checked in first has the original ticket. So, any time a duplicate boarding pass is encountered, the system sends a message: “This is a duplicate boarding pass.”
 *
 * Now, the already running system makes use of the conventional method of searching an array for a boarding pass, which obviously takes up time.
 *
 * So, you are assigned the task of redesigning the system in such a manner that the overall add and retrieval times get improved or, in other words, you get a constant time.
 *
 * Note: For the purpose of simplicity, let’s assume the boarding pass numbers are integers; the HashMap values can be strings that say “Checked”.
 *
 * Hint: While adding a number to the hash table, check if it already exists or not.
 *
 * Input:
 *       1. The first input is 'n', boarding pass numbers.
 *       2. The input in next is 'n' boarding pass numbers (space-separated).
 *
 * Output:
 * Display the boarding pass number that is a duplicate
 */
public class TheAirlineBoardingPassProblem {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>(size);
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<size;i++) {
            if(boardingPass.get(arr[i]) == "Checked"){
                System.out.println(arr[i]);
            } else {
                boardingPass.put(arr[i], "Checked");
            }
        }
    }
}
