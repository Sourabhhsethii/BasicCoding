package com.sorting.scaler.inter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Scaler
 *
 * 1.) Observe the Question First -> If We will remove large number first its contribution to the array will be remove, hence the cost will be min.
 *
 * In one operation, you can remove any element from the array, and the cost of this operation is the sum of all elements
 * in the array present before this operation.
 *
 * Find the minimum cost to remove all elements from the array.
 *
 * A = [4, 6, 1]
 *
 * [4,6,1]
 * [6,4,1] = 11
 * remove 6
 * [4,1] = 5
 * remove 4
 * [1] = 1
 *
 * Ans = 17
 */
public class MinCost {
    public static void main(String[] args) {
        System.out.println( "Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int length;

        ArrayList<Integer> list = new ArrayList<>();
        length = sc.nextInt();
        for (int i=0;i<length;i++){
             list.add(sc.nextInt());
        }

        System.out.println("Approach 1--> " + approach1(list));
        System.out.println("Approach 2--> " + approach2(list));
    }

    // T.C -> O(nlogn) but with observation applying formula.
    public static int approach1(ArrayList<Integer> list){
        int cost = 0;

        list.sort((a,b)->  b-a); // logn *
        for (int i=0;i<list.size();i++){ // n
            cost += list.get(i) * (i+1);
        }
        return cost;
    }

    // T.C -> O(nlogn) but two loops
    public static int approach2(ArrayList<Integer> list){

        list.sort((a,b)->  b-a);// logn *
        int sum = 0;
        for (int x: list){ // n +
            sum += x;
        }
        int ans = 0;
        for (int i=0;i<list.size();i++){ // n
            ans += sum;
            sum -= list.get(i);
        }

        return ans;

    }
}
