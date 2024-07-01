package com.bitmanupilation;

public class SingleDuplicateNumber {

    public static void main(String[] args) {

        System.out.println(singleDuplicateNumber(new int[] {1,2,3,1,2,3,4,4,5}));

    }

    static  int singleDuplicateNumber(int... a){

        int number = 0;
        for(var i : a){
            number ^= i;
        }
        return number;
    }
}
