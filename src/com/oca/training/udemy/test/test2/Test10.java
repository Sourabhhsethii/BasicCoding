package com.oca.training.udemy.test.test2;

class Parent2 {
    int i = 10;
    Parent2(int i) {
        super();
        this.i = i;
    }
}

class Child2 extends Parent2 {
    int j = 20;

    Child2(int j) {
        super(0);
        this.j = j;
    }

    Child2(int i, int j) {
        super(i);
       // this(j); // Error
    }

}

public class Test10 {
    public static void main(String[] args) {
        Child2 child = new Child2(1000, 2000);
        System.out.println(child.i + ":" + child.j);

        String str1 = " ";
        boolean b1 = str1.isEmpty();
        System.out.println(b1);
        str1.trim();
        b1 = str1.isEmpty();
        System.out.println(b1);

        System.out.println();

        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);

        System.out.println();
        System.out.println(new Boolean("true"));
    }
}