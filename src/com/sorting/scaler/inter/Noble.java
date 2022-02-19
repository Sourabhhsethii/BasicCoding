package com.sorting.scaler.inter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p.
 *
  4
  3 2 1 3

 3
 5 6 2

  4
  1 1 3 3
 */
public class Noble {

    public static void main(String[] args) {
        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int length;

        ArrayList<Integer> list = new ArrayList<>();
        length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Approach 1--> " + solve(list));
    }

    public static int solve(ArrayList<Integer> list){

        int ans = -1;
        int count = 0;
        // First Sort the Array In Desc;
        list.sort((a,b)->  b-a);

        for (int i=0;i<list.size();i++){

            if(list.get(i) == i){

                int temp = list.get(i);
                for (int k=i;k<list.size();k++)
                {
                    if(list.get(k) ==  temp){
                        count++;
                        i++;
                    } else{
                        break;
                    }
                }
            }

        }

        if(count >0){
            ans = 1;
        }

        return ans;
    }

}
