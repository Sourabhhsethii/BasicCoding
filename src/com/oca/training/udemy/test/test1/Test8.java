package com.oca.training.udemy.test.test1;

public class Test8 {
    public static void main(String[] args) {
        String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2); // Str2 and St1 both is refernce to str 2 i.e CoRe
    }
}