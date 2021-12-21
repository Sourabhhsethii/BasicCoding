package com.oca.training.udemy.methods;

public class MethodReturnType {
    public static void main(String[] args) {

    }

    public void jump(){

    }
    public void jump2(){
        return; // return is redundant
    }

    public String jump3(){
        return "";
    }

    /*public jumb6(){

    }*/

    String jump6(int a){
       /* if(a ==5 ){
            return "";
        }*/

        return "";
    }

    int getInt(){
        return 9;
    }

    long getLong(){
        return 9L;
    }

    int getLongToInt(){
        return (int) 9L;
    }

    int expanded(){
        int temp = 10;
        return temp;
    }

    boolean isTrue(){
        return 5==5;
    }

    public void test(){
        // return 5 ==5; // This cant compile
    }

    /*
    public void void(){

    }

    public public(){

    }*/

    public void  $test(){

    }

    public void _test(){

    }
    // Does not complie, no return statement

//    public String jump4(){
//
//    }

}
