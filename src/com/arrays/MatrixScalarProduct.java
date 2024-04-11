package com.arrays;

import java.util.ArrayList;

public class MatrixScalarProduct {

    public static void main(String[] args) {

    }

    // T.C -> O(N^2) && S.C-> O(N^2)
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        ArrayList<ArrayList<Integer>>  temp = new ArrayList<>();
        for(int i =0;i<A.size();i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<A.get(0).size();j++) {
                arr.add(A.get(i).get(j) * B);
            }
            temp.add(arr);
        }
        return temp;
    }
    // T.C -> O(N^2) && S.C-> O(1)
    public ArrayList<ArrayList<Integer>> solve2(ArrayList<ArrayList<Integer>> A, int B) {
        for(int i =0;i<A.size();i++){
            for(int j=0;j<A.get(0).size();j++) {
              int mul = A.get(i).get(j) * B;
              A.get(i).set(j,mul);
            }
        }
        return A;
    }
}
