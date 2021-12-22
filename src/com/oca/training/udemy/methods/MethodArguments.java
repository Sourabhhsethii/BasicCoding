package com.oca.training.udemy.methods;

public class MethodArguments {

    int getZerro(){ // 0 Method With Zero Arguments // niladic
        return 0;
    }

    int increment(int number){ // 1 argument // (monadic)
        return number+1;
    }

    int sum(int a, int b){  // 2 argument // (dyadic)
        return a+b;
    }

    int plusMinus(int a, int b,int c){ // 3 argument // (triadic)
        return a + b + c;
    }

    double average(double a, double b, double c, double d){ // 4 argument // (polyardic)
        return (a+b+c+d)/ 4.0;
    }

    public static void main(String[] args) {

    }

    // void test {} // does not compile no brackets

    // void test(int a, int b){} // does not comile
    // void test2(int a, int b); // missing method body, doesn not compile

}
