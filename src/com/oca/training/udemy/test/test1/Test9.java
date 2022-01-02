package com.oca.training.udemy.test.test1;

public class Test9 {
    public static void main(String[] args) {
        double price = 90000;
        String model;
        if(price > 100000) {
            model = "Tesla Model X";
        } else if(price <= 100000) {
            model = "Tesla Model S";
        }
        // System.out.println(model); // Complation Error will only goes when it is initlized or added in else condition.
    }
}