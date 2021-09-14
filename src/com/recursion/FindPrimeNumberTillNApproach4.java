package com.recursion;

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


    /**
     * We can find the number till n with simple formula; // Apporach 2
     * Any prime number can be represented in the form of 6K+1 & 6k-1
     * @param num
     * @return
     */
    public void primaryCheck(int num){

        boolean[] marking = new boolean[num+1];

        if(num<1) {
            marking[0] = false;
            marking[1] = false;
        }
        for(int i=2; i< num;i++){
            marking[i] = true;
            for (int j = i+1; j<num;j++){

                    if(i%j == 0){
                    marking[j] = false;
                } else {
                        marking[j] = true;
                    }

            }
        }

        for (int i=0;i<marking.length;i++){

            if(marking[i]){
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String args[]){
        FindPrimeNumberTillNApproach4 fn = new FindPrimeNumberTillNApproach4();
        fn.primaryCheck(33);
    }
}
