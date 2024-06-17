package com.testenums;

public enum Test implements EnumInterface {

    Hello{
        void get(int a){
            System.out.println("Test Hello");
        }
    },
    Bye{
        void get(int a){
            System.out.println("Test Bye");
        }
    },
    Hi{
        void get(int a){
            System.out.println("Test Hi");
        }
    };

    public static int test = 1;
    int check = 2;
    private int add = 3;

    Test() {
        System.out.println("static variable test " + 1 + check + 3);
    }

    @Override
    public void show(){
        System.out.println("test - show");
    }

}
