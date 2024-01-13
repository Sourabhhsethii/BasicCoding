package com.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArithmeticProgression {

    public static void main(String[] args) {
        int[] A = new int [3];
        A[0] = 2 ;
        A[1] = 4;
        A[2] = 1;
        // List<Integer> arrlist =  List.of(-251,-305,-323,-53,-215,-143,-107,-161,-179,-431,-449,-17,-341,-413,-35,-125,-197,-377,-269,-71,-359,-89,-233,-287,-395);
       // List<Integer> arrlist =  List.of(-87,-28,-20,37,-59,47,-75,-55,28,-9,-20,16,-56,-95,98,32,35,-97,96,74);
        List<Integer> arrlist =  List.of(3,5,1);

        int[] arr = new int[arrlist.size()];

        // ArrayList to Array Conversion
        for (int i = 0; i < arrlist.size(); i++)
            arr[i] = arrlist.get(i);
            System.out.println(solve(arr));
    }

    public static int solve(int[] A) {
        int result = 1;
        Arrays.sort(A);

        if(A.length > 2){
            int diff = Math.abs(A[0] - A[1]);
            for(int i=1;i<A.length-1;i++) {
                int no = Math.abs(A[i]-A[i+1]);
                if( no != diff ) {
                    result = 0;
                }
            }
        } else {
            result = 1;
        }
        return result;
    }

    public static int[] sort(int[] A){

        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]) {
                    int temp = 0;
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;
    }
}
