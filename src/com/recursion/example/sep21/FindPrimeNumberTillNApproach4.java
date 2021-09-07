package com.recursion.example.sep21;

/*
Sieve of Eratosthenes
Algorithm:
Create a list of consecutive integers from 2 to n.
Initially, let p be equal to 2, which is the smallest prime number.
Mark all the numbers that can be divided by p i.e 2p, 3p, 4p, etc.
Find the first number that is greater than p that is not marked. If there is no such number, stop. Otherwise, let p now equal this new number (which is the next prime), and repeat from step 3.
When the algorithm terminates, the numbers that are not marked are all the prime numbers below n.
 */
public class FindPrimeNumberTillNApproach4 {
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


    /**
     * We can find the number till n with simple formula; // Apporach 2
     * Any prime number can be represented in the form of 6K+1 & 6k-1
     * @param num
     * @return
     */
    public boolean primaryCheck(int num){
        if(num<1) return false;
        if(num<=3) return true;
        if (num%2 == 0 || num%3 ==0) return false;
        for(int i=5; i<= Math.sqrt(num);i=i+6){
            if(num%i ==0 || num%(i+2)==0){
                return false;
            }
            return true;
        }

        return true;
    }

    public static void main(String args[]){
        FindPrimeNumberTillNApproach4 fn = new FindPrimeNumberTillNApproach4();
        fn.findPrimeNumber(33);
    }
}
