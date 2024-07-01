package com.bitmanupilation;

public class CountBit {

    public static void main(String[] args) {
        System.out.println(countSetBits(0b111111100101));
    }

    static int countSetBits(int number){

        int count = 0;

        for(int i=0;i<31;i++){
            if(CheckBit.checkBit(number,i)){
                count++;
            }
        }

        return count;

    }
}
