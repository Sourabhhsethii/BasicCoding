package com.oca.training.udemy.methods;

import com.oca.training.udemy.common.Common;

public class AccessModifiers {

    public static void main(String[] args) {

        Common common = new Common();
        common.publicPrint();
       // common.defaultPrint(); // 'defaultPrint()' is not public in 'com.oca.training.udemy.common.Common'. Cannot be accessed from outside package
       // common.protectedPrint(); // 'protectedPrint()' has protected access in 'com.oca.training.udemy.common.Common

        System.out.println("publicNumber= " +  common.publicInt);
      //  System.out.println("protectedNumber= " +  common.protectedNumber);
       // System.out.println("defaultInt= " +  common.defaultInt);
        // System.out.println("privateInt= " +  common.privateInt);
    }

}
