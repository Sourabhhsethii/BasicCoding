package com.testenums;

public class Main {
    public static void main(String[] args) {
        Test test  = Test.Hi;
        System.out.printf("test ordinal-> ", Test.Hi.ordinal() );
        System.out.println(Test.Hello);
        System.out.println(test.check);
        test.show();

        if(test == Test.Hi){
            System.out.printf("test " + test);
        }
    }
}
