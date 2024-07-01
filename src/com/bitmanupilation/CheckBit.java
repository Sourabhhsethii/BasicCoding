package com.bitmanupilation;

public class CheckBit {
    public static void main(String[] args) {
        System.out.println(checkBit((short) 1));
        System.out.println(checkBit(1101,1));
    }

    static boolean checkBit(short i){
        boolean isSet = false;
        if((i&1) == 1) {
             isSet = true;
        }
        return isSet;

    }

    static boolean checkBit(int number, int place){
        boolean isSet = false;
        if( ((number>>place) &1) == 1) {
            isSet = true;
        }
        return isSet;

    }
}
