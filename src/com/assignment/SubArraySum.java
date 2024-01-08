package com.assignment;

public class SubArraySum {

    public static void main(String[] args) {
        int[] A = new int[3];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        System.out.println(subarraySum3(A));
    }

    // O(N*N*N) => N^3 - Complexity!!!
    public static long subarraySum(int[] A) {
        long arraySum =0;
        for(int i=0;i<A.length;i++) {

            for(int j=i; j<A.length;j++){
                long sum = 0;
                for(int k=i;k<=j;k++) {
                    sum += A[k];
                }
                arraySum += sum;
            }
        }
        return arraySum;
    }

    // O(N*N) => N^2 - Complexity!!!
    public static long subarraySum2(int[] A) {
        long arraySum =0;
        for(int i=0;i<A.length;i++) {
                long sum = 0;
            for(int j=i; j<A.length;j++){
              sum =  sum  + A[j];
              arraySum = arraySum  + sum;
            }
        }
        return arraySum;
    }

    /**
     * Contribution technique - Contribution of every element;
     * @param A
     * @return
     */
    // O(N*N) => N^2 - Complexity!!!
    public static long subarraySum3(int[] A) {
        long arraySum =0;
        for(int i=0;i<A.length;i++) {
           long left = i+1;
           long right = A.length-i;
           long total = left * right;
           arraySum = arraySum + (total * A[i]);
        }
        return arraySum;
    }
}
