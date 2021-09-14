package com.recursion;

/*
 Any prime number can be represented in the form of 6K+1 & 6k-1
 */
public class FindPrimeNumberTillNApproach3 {
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
        FindPrimeNumberTillNApproach3 fn = new FindPrimeNumberTillNApproach3();
        fn.findPrimeNumber(33);
    }
}
