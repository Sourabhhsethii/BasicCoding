package com.recursion.example.sep21;

public class Demo {
    int i = 1;

    int function() {
        if (i <= 5) {
            i++;
            function();

            System.out.print(i+ " ");
        }
        return 0;
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.function();
    }
}