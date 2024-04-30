package com.arrays;

import com.oca.training.udemy.test.classes.A;

import java.util.ArrayList;
import java.util.Collections;

public class FirstMissingInteger {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(3);
        A.add(1);
        A.add(2);
        System.out.println(secondSolution(A));

    }


        public static int secondSolution(ArrayList<Integer> A) {
            int n = A.size();
            for (int i = 0; i < n; i++) {
                if (A.get(i) > 0 && A.get(i) <= n) {
                    int pos = A.get(i) - 1;
                    if (A.get(pos) != A.get(i)) {
                        Collections.swap(A, pos, i);
                        i--;
                        // We are doing i-- as we have swapped i'th element with pos'th element and we might not have processed the pos'th element.
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (A.get(i) != i + 1)
                    return (i + 1);
            }
            return n + 1;
        }


    public static int firstMissingPositive(ArrayList<Integer> A) {

        int n = A.size();

        for(int i=0; i<n; i++){
            if(A.get(i) < 0){
                A.set(i,n+1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0 && A.get(i) <= n) {
                int pos = A.get(i) - 1;
                if (A.get(pos) != A.get(i)) {
                    Collections.swap(A, pos, i);
                    i--;
                    // We are doing i-- as we have swapped i'th element with pos'th element and we might not have processed the pos'th element.
                }
            }
        }

        int number =0;
        for(int i=0;i<n;i++) {
            if(A.get(i)>0){
                number = i+1;
                break;
            }
        }

        if(number == 0){
            number = n+1;
        }

        return number;

    }


}
