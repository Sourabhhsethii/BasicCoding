package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[]  test = {1,2,3,4,5};
        System.out.println(solve(test,5).length);
    }

    // O(N) Solution!!!!!
    public static int[] solve(int[] A, int B) {

        long sum =0;
        int s = -1, e = -1;
        HashMap<Long,Integer> map = new HashMap<>();
        map.put(0L,-1);

        for(int i=0;i<A.length;i++){
            sum+= A[i];
            if(map.containsKey(sum-B)){
                s = map.get(sum-B) +1;
                e = i;
                break;
            }
                map.put(sum,i);

        }

        if(s == -1){
            int [] ans = {-1};
            return ans;
        }

        int[] ans = new int[e-s+1];
        int k =0;
        for(int i=s;i<=e;i++){
            ans[k] = A[i];
            k++;
        }
        return ans;
    }

    // O(N^3) Solution!!!!!
    public static int[] solve2(int[] A, int B) {

        int n = A.length;
        ArrayList<Integer> al = null;
        boolean found = false;
        outerloop:
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                // All Sub Arrays.
                int sum = 0;
                al = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    sum += A[k];
                    al.add(A[k]);
                }
                if(sum == B){
                    found = true;
                    break outerloop;
                }
            }

        }

        if(!found){

            int[] rs = new int[1];
            rs[0] = -1;
            return rs;
        } else {
            int [] rs = new int[al.size()];
            for(int i=0;i<al.size();i++){
                rs[i] = al.get(i);
            }
            return rs;
        }
    }
}


