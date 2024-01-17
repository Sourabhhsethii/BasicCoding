package com.assignment;

import java.util.List;

public class SpecialIndex {

    public static void main(String[] args) {
        List<Integer> arrlist =  List.of(1,2,3,7,1,2,3);

        int[] arr = new int[arrlist.size()];

        // ArrayList to Array Conversion
        for (int i = 0; i < arrlist.size(); i++)
            arr[i] = arrlist.get(i);
        System.out.println(solve(arr));
    }

    public static int solve(int[] A) {

        int n = A.length;
        int count =0;

        for(int i=0;i<n;i++){

            int sumOfEvenIndex = 0;
            int sumOfOddIndex  = 0;

            // Left Sum
            for(int j=0;j<i;j++){
                if(j%2 == 0){
                    sumOfEvenIndex += A[j];
                } else {
                    sumOfOddIndex += A[j];
                }
            }

            // Right Sum
            for(int j=i+1;j<n;j++) {


                    int changedIndex = j;

                    if (changedIndex % 2 == 0) {
                        sumOfOddIndex  += A[changedIndex];
                    } else {
                        sumOfEvenIndex += A[changedIndex];
                    }


            }

            if(sumOfEvenIndex == sumOfOddIndex){
                count++;
            }
        }
        return count;
    }
}
