package com.recursion;

public class FindPrimeNumberTillNApproach2 {
    public void findPrimeNumber(int n){ // O(n) * O(n) => O(n^2)
        // Base Condition
        if(n < 2){
            return;
        }


        findPrimeNumber(n-1); // fn(n-1) = n-1...n-2...n-3...2 => O(n)
        // Work;
        if(primaryCheck(n) ){  //O(n)
            System.out.print( n + " ");
        }

    }


    /**
     * We can find the number till Squareoot(n); // Apporach 2
     * i <= Math.sqrt(num);
     * or
     * i*i <= num;
     * @param num
     * @return
     */
    public boolean primaryCheck(int num){ // O(n)
        for (int i = 2; i <= Math.sqrt(num); i++) { // fn(underroot(n)-1) => n-1....n-2...n--3......2 => O(underroot(n);
            if ((num%i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        FindPrimeNumberTillNApproach2 fn = new FindPrimeNumberTillNApproach2();
        fn.findPrimeNumber(200);
    }
}
