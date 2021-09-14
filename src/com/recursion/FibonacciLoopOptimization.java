package com.recursion;

import java.util.Scanner;
public class FibonacciLoopOptimization {

    /*
    With Recursion
    T(n-1)..T(n-2)...T(n) ==> n(n-1)/2 ---> O(n)
    Time complexity will be O(n);
     */
    public int fibonacci(int n) {
        if (n == 0 || n==1)
            return n;
        else
            return (fibonacci(n - 1) + fibonacci(n - 2))%10;
    }

    /*
    With Loop
    Time complexity will be O(n);
     */
    public int fibonacciLoop(int n) {
        int sum = 0;
        for(int i=n;i>0;i--){

            sum += i;
        }
        sum = sum%10;
        return sum;
    }

    /*
   With Loop
   Time complexity will be O(n);
    */
    public void otimizedfibonacciLoop(int n) {
        int[] f =  new int[n+1];
        f[0] = 0;
        f[1] =1;

        for(int i=2;i<=n;i++)
            f[i] =  (f[i-1] + f[i-2]) % 10;
        System.out.println(" Fibonacci number: " + f[n]);
    }

    /*
More With Loop
Time complexity will be O(n);
Space Complexity wil be O(1) ==> Swapping c;
*/
    public void moreOtimizedfibonacciLoop(int n) {
        int a = 0;
        int b = 1;
        int c = n;
        for(int i=2;i<=n;i++){ // from 2nd postion to n...
            c = a + b;
            a =  b;
            b = c;
        }
        System.out.println(" Fibonacci number: " + c%10);
    }

    public static void main(String args[]) {
        System.out.println("Enter the fibonacci number to be generated : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FibonacciLoopOptimization sequence = new FibonacciLoopOptimization();
        int number = sequence.fibonacci(n);
        System.out.println("Fibonacci number:  " + number);
        int numberWithLoopMethod = sequence.fibonacciLoop(n);
        System.out.println("Fibonacci number:  " + numberWithLoopMethod);
        sequence.otimizedfibonacciLoop(n);
        sequence.moreOtimizedfibonacciLoop(n);
    }
}
