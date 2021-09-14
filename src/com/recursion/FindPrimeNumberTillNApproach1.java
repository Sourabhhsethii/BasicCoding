package com.recursion;

/*
Prime Numbers Less Than Or Equal To n
 */
public class FindPrimeNumberTillNApproach1 {

    public void findPrimeNumber(int n){ // O(n) * O(n) => O(n^2)
        // Base Condition
        if(n < 2){
            return;
        }

            // Work;
        if(primaryCheck(n) ){  //O(n)
            System.out.print( n + " ");
        }
        findPrimeNumber(n-1); // fn(n-1) = n-1...n-2...n-3...2 => O(n)


    }

    public boolean primaryCheck(int num){ // O(n)
        for (int i = num-1; i >= 2; i--) { // fn(n-1) => n-1....n-2...n--3......2 => O(n);
            if ((num%i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        FindPrimeNumberTillNApproach1 fn = new FindPrimeNumberTillNApproach1();
        fn.findPrimeNumber(20);
    }
}
