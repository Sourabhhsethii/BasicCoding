package com.oca.training.udemy.exam.questions;

public class MethodsMain {

    private static final String bench;

   static {
       bench = "bench";
   }

   public static long square(int x){
       long y = x* (long)x;

       x=-1;
       return y;
   }

    // Q1
    final static void jump4(){}
   // public final int void jump(){}
   // private void int jump(){}
    // static void int jump();
    // void final method(){}
    // void public jump(){}
    static final void jump3(){}

    //Q2
    public void runA(){ return;}
    //public void runB(){return null;}
    public void runC(){}
    public int runD(){return 9;}
    //public int runE(){return 9.0;}
    //public int runF(){ return;}
    //public int runG(){ return null;}

    //Q3
    public void jumpA(int... nums){}
    public void JumpB(String values,int... nums){}
    //public void jimps(int... nums, String values){} // Complier get confused for Variable Args
    //public void jumpD(String... values, int... numbs){}// Complier get confused for Variable Args
    // public void jumpE(String values[], ...int nums){} // Wrong Syntax
    // public void jumpF(String... vales, int[] nums){} // Complier get confused for Variable Args
    public void jumppG(String[] values, int[] nums){}



    //Q4
    public static int count(boolean b, boolean... b2){
        return b2.length;
    }

    public static void play(){
        int a = 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        // System.out.println(count(true, {true, true})); // Error
        System.out.println(count(true, new boolean[2]));
        System.out.println(count(true, true, true));
        MethodsMain rope = null;
        rope.play(); // Static methods can be called if the Object is refernced to null

       // bench = "beanch";
    }


}
