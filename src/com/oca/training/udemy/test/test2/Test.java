package com.oca.training.udemy.test.test2;

class Student2 {
    String name;
    int age;

    Student2() {
        this("James", 25);
    }

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Test {
    private static boolean flag = !true;
    public static void main(String[] args) {
        Student2 s = new Student2();
        System.out.println(s.name + ":" + s.age);

        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2;
        System.out.println(a);

        int x = 5;
        while (x < 10) {
            System.out.println(x);
            x++;
        }

        System.out.println(!flag ? args[0] : args[1]);
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(args.length);

       /* ArrayList<Integer> original = new ArrayList<>();
      //  original.add(new Integer(10));

        // ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
        Integer i1 = cloned.get(0);
        i1= i1+1;

        System.out.println(cloned);*/
    }
}