package com.oca.training.udemy.common;

public class Common {

    public int publicInt = 10;
    protected int protectedNumber = 20;
    int defaultInt = 30;
    private int privateInt = 40;

    public static void main(String[] args) {
        Common cm = new Common();
        cm.privatePrint();
        cm.defaultPrint();
        cm.protectedPrint();
        cm.publicPrint();

        System.out.println("publicNumber= " +  cm.publicInt);
        System.out.println("protectedNumber= " +  cm.protectedNumber);
        System.out.println("defaultInt= " +  cm.defaultInt);
        System.out.println("privateInt= " +  cm.privateInt);
    }

    public void publicPrint(){
        System.out.println("public");
    }

    protected void protectedPrint(){
        System.out.println("Protected");
    }

    void defaultPrint(){
        System.out.println("Default");
    }

    private void privatePrint(){
        System.out.println("Private");
    }
}
