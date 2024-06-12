package com.enumtest;

enum Conditional {
    TRUE,
    UNKNOWN,
    FALSE;



    Conditional(int x) {
        System.out.println("Constructor Called with param");
    }

    Conditional() {
        System.out.println("Constructor Called");
    }
}
