package com.bitmanupilation;

import java.util.ArrayList;

public class TwoUniqueElementsFromDuplicateNumberList {

    public static void main(String[] args) {

        int[] arr = new int[] {1,1,2,2,3,3,4,4,5,6};
        int xor = 0;
        for (var i: arr){
            xor ^= i;
        }

        int setBitPos = 0;
        for (int i=0;i<31;i++) {
            if(CheckBit.checkBit(xor,i)) {
                setBitPos = i;
                break;
            }
        }

        System.out.println(getUniqueElements(arr,setBitPos));
    }

    static ArrayList getUniqueElements(int[] arr, int setBitPos) {
        int set = 0, unset = 0;
        for(int i=0;i<arr.length;i++){

            if( ((arr[i]>>setBitPos) & 1) == 1) {
                set  ^= arr[i];
            } else {
                unset  ^= arr[i];
            }

        }

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(set);
        arrayList.add(unset);
        return arrayList;
    }

}
