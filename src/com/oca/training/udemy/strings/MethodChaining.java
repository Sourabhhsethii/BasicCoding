package com.oca.training.udemy.strings;

public class MethodChaining {
    public static void main(String[] args) {
        String start = " Java ";
        String trimmed = start.trim();
        System.out.println("trimmed= " + trimmed);

        String lowercase = trimmed.toLowerCase();
        System.out.println("lowercase = " + lowercase);

        String result = lowercase.replace("j", "J");
        System.out.println("result= " + result);

        String anotherResult = " Java ".trim().replace("j","J");
        System.out.println("anotherResult= " +  result);

        System.out.println(result.equals(anotherResult));

        String a = "abc";
        String b = a.toUpperCase();
        String c = b.replace("B", "b").replace("C","c");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);

        if(a.equalsIgnoreCase(b))
            System.out.println("String are equals");

        if(a.toLowerCase().trim().equals(b.toUpperCase().trim())){
            System.out.println("Equal");
        }
    }
}
