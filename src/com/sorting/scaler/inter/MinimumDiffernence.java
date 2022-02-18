package com.sorting.scaler.inter;

import java.util.ArrayList;
import java.util.Scanner;

/**

 4 - > 1 10 5 7

 4
 1 10 5 7

 */
public class MinimumDiffernence {
    public static void main(String[] args) {
        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int length;

        ArrayList<Integer> list = new ArrayList<>();
        length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Approach 1--> " + approach1(list));
         System.out.println("Approach 2--> " + approach2(list));
    }

    // O(N^2)
    public static int approach1(ArrayList<Integer> list){
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<=list.size()-1;i++){
            for(int j=i+1;j<=list.size()-1;j++){
               ans = min(ans,Math.abs(list.get(i)-list.get(j)));
            }
        }

        return ans;
    }

    //SORT First // T.C O(nlogn)
    public static int approach2(ArrayList<Integer> list){
        int ans = Integer.MAX_VALUE;
        list.sort((a,b)->  b-a);
        for(int i=1;i<list.size()-1;i++){
            ans = min(ans,Math.abs(list.get(i)-list.get(i-1)));
        }
        return ans;
    }


    public static int min(int a, int b){
        if(a<b){
            return a;
        } else {
            return  b;
        }
    }
}
