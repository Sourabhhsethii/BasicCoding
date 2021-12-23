package com.oca.training.udemy.methods;

public class MethodOverload {

    public void walk(int walk){

    }
    public void walk(short feet){

    }

    public boolean walk(){
        return false;
    }

    void walk(int miles, short feet){

    }

    // Does not compile

  /*  public  void walk(float miles){

    }*/

 /*   public static void walk(float mile){

    }*/

    void walk(int[] miles){

    }

    /*void walk(int... miles){

    }
*/

    public static void run(int length) {

    }

    public static void run(Integer length) {

    }

    public static void run(double length) {

    }
    public static void run(float length) {

    }


    public int walk(float km){

        return 1;
    }


    public static void jump(String s) {
        System.out.println("string");
    }

    public static void jump(Object s) {
        System.out.println("object");
    }

    public static int sum(int a, int b){
        System.out.println("int sum");
        return a+b;
    }

    public static long sum(long a, long b){
        System.out.println("long sum");
        return a+b;
    }

    public static Integer sum(Integer a, Integer b){
        System.out.println("integer sum");
        return a +b;
    }

    public static Integer sum(int... numbers){
        System.out.println("sum var args");
        int sum =0;
        for (int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        run(1.0);
        jump("test");
        jump(25);

        sum(1,2);
    }


}
