package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctNumberInwindow {

    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(1);
        temp.add(3);
        temp.add(4);
        temp.add(3);

        ArrayList<Integer> temp2 = new ArrayList<>();
        temp2.add(31);
        temp2.add(51);
        temp2.add(31);
        temp2.add(51);
        temp2.add(31);
        temp2.add(31);
        temp2.add(31);
        temp2.add(31);
        temp2.add(31);
        temp2.add(31);
        temp2.add(51);
        temp2.add(31);
        temp2.add(31);


        System.out.println(dNums(temp2,3));
    }


    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> temp = new ArrayList<>();
        if(B>A.size()){
            return temp;
        } else {

            HashMap<Integer,Integer> hs = new HashMap();

            for(int i=0;i<B;i++){
                if(hs.containsKey(A.get(i))){
                    int value =  hs.get(A.get(i));
                    hs.put(A.get(i), ++value);
                } else {
                    hs.put(A.get(i),1);
                }
            }
            temp.add(hs.size());

            for(int i=1; i<=A.size()-B; i++){
                int end = i+(B-1);


                if(hs.containsKey(A.get(i-1))) {
                    int reduceOneMinsStart = hs.get(A.get(i-1));
                    if(reduceOneMinsStart == 1){
                        hs.remove(A.get(i-1));
                    } else if(reduceOneMinsStart > 1){
                        hs.put(A.get(i-1),--reduceOneMinsStart);
                    }

                }


                    if(hs.containsKey(A.get(end))) {
                        int value = hs.get(A.get(end));
                        hs.put(A.get(end), ++value);
                    } else {
                        hs.put(A.get(end),1);
                    }




                temp.add(hs.size());

            }
        }
        return temp;
    }
}
