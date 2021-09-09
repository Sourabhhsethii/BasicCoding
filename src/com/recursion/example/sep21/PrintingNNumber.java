package com.recursion.example.sep21;

public class PrintingNNumber {
    int i = 0;

    int function() {
        if (i <= 8) {
            i++;

            System.out.print(i+ " ");
            function();
        }
        return 0;
    }

    public static void main(String[] args) {
        PrintingNNumber obj = new PrintingNNumber();
        obj.function();
    }
}