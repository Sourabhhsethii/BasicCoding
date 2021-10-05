package com.hashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * First Unique Character
 * You will be given a string, and you have to find and print the first unique character, i.e., the first non-repeating character of the string.
 *
 * Note: The string may contain duplicate characters.
 * Example:
 *
 * If the given string is ‘abcdebadf’, then the first unique character is c.
 *
 * If you observe the given string:
 *
 * The first character ‘a’ is repeated abcdebadf.
 *
 * The second character ‘b’ is repeated abcdebadf.
 *
 * The third character ‘c’ is not repeated abcdebadf.
 *
 * Therefore, the first unique character, i.e., the first non-repeating character of the string, is ‘c’.
 */
public class FirstUniqueCharacter {

    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);
        //storing the input string to String variable "str"
        String str = in.nextLine();

        HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            Integer checkValue = hash.get(str.charAt(i));
            if(checkValue==null){
                hash.put(str.charAt(i),1);
            } else {
                checkValue = checkValue +1;
                hash.put(str.charAt(i),checkValue);
            }
        }

        int found = 0;
        for(int i=0;i<str.length();i++) {
            if(hash.get(str.charAt(i)) == 1){
                System.out.println(str.charAt(i));
                found =1;
                break;
            }
        }

        if(found == 0){
            System.out.println(-1);
        }

        System.out.println(hash);

    }
}
