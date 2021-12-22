package com.oca.training.udemy.common;

public class AnotherCommon {

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.defaultPrint();
        common.protectedPrint();
        // common.privatePrint(); // 'privatePrint()' has private access in 'com.oca.training.udemy.common.Common'

        System.out.println("publicNumber= " +  common.publicInt);
        System.out.println("protectedNumber= " +  common.protectedNumber);
        System.out.println("defaultInt= " +  common.defaultInt);
        // System.out.println("privateInt= " +  common.privateInt); // private access
    }
}
