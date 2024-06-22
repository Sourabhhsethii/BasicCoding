package com.testclasses;

public class SuperThis {

    public static void main(String[] args) {

        This obj = new This();
    }

}

class Super {

    Super() {
        super();
        System.out.println("I am in Super");
    }

}

class This extends Super {

    This() {

        this(1);
        System.out.println("I have called this(1)");
    }

    This(int a) {
        super();
        System.out.println("I am in This");
    }

}
