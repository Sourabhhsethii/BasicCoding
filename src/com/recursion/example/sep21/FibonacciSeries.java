package com.recursion.example.sep21;

/*
 Via Recursion
 e.g 0,1,1,2,3,5,8,11,19...
 First Number == 0;
 Second Number == 1;

 F(n) = F(n-1) + F(n-2)

 */
public class FibonacciSeries {

    public static int fibonacciCalculation(int series){

        //Base Condition
        if(series == 0 || series == 1)
            return series;

        return fibonacciCalculation(series-1) + fibonacciCalculation(series-2);

    }

    public  static  void  main(String args[]){
        System.out.println(fibonacciCalculation(5));
    }
}

// How We can Optimize it?
