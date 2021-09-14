package com.recursion;


import java.util.Scanner;

/*
You are given an array of integers. You need to replace each element with the product of the remaining elements.
You are not allowed to use division operators.

For example: Consider the array {1, 2, 3, 4, 5}

Product of the other elements except 1 = 2 * 3 * 4 * 5 = 120
Product of the other elements except 2 = 1 * 3 * 4 * 5 = 60
Product of the other elements except 3 = 1 * 2 * 4 * 5 = 40
Product of the other elements except 4 = 1 * 2 * 3 * 5 = 30
Product of the other elements except 5 = 1 * 2 * 3 * 4 = 24

Hence, the output would be {120, 60, 40, 30, 24}.

https://www.techiedelight.com/replace-element-array-product-every-element-without-using-division-operator/

 */
public class ReplaceWithProductofRemainingElements {

    static void RPRE(int arr[], int n)
    {


        // base case
        if (n == 0) {
            return;
        }

        // use two auxiliary arrays
        int[] left = new int[n];
        int[] right = new int[n];

        // `left[i]` stores the product of all elements in subarray[0…i-1]
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = arr[i - 1] * left[i - 1];
        }

        // `right[i]` stores the product of all elements in subarray[i+1…n-1]
        right[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            right[j] = arr[j + 1] * right[j + 1];
        }

        // replace each element with the product of its left and right subarray
        for (int i = 0; i < n; i++) {
            arr[i] = left[i] * right[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        RPRE(arr, n);
    }
}
