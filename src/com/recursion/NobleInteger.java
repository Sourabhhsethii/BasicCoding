package com.recursion;

import java.util.Scanner;

/*
You are given an integer array. Determine if an integer x exists such that the number of integers greater than x in the array is equal to x.
Let's consider the array [4, 5, 8, 3]. You can see that 4, 5 and 8 are greater than 3. So, the number of integers greater than 3 in the array is 3.
Hence, you return 1.

Approach
Sort the array.
The condition to check for will be as follows:
Size of the array - index - 1 == Element at that index
 */
public class NobleInteger {

    static int nobleNum(int arr[], int n)
    {   int temp = 0;
        int found = -1;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i] >arr[j]) {      //swap elements if not in order
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }

        for(int i=0;i< arr.length;i++){
            if((n-i-1)== arr[i] ){
                found = 1;
                break;
            }
        }

        return found;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        System.out.println( nobleNum(arr, n)+ "\n" );
    }
}
