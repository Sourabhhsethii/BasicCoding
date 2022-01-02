package com.oca.training.udemy.test.test1;

import java.util.ArrayList;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2); // Str2 and St1 both is refernce to str 2 i.e CoRe

        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove('2');
        }

        for(char ch : list) {
            System.out.print(ch);
        }
    }
}